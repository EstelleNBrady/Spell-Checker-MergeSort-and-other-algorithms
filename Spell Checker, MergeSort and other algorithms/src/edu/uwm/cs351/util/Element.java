package edu.uwm.cs351.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Parsed representation of an XML element.
 */
public class Element {

	private final String name;
	private Map<String,String> attrs;
	private List<Object> contents;
	
	/**
	 * Create an element with the given name
	 * @param name name of element, must not be null
	 */
	public Element(String name) {
		if (name == null) throw new IllegalArgumentException("element name cannot benull");
		this.name = name;
	}
	
	/**
	 * Create an element with the given name and contents.
	 * @param name name of element, must not be null
	 * @param contents strings and elements to be nested.
	 * @throws IllegalArgumentException if something other than a string or element 
	 * is used in the contents.
	 */
	public Element(String name, Object... contents) {
		this(name);
		this.contents = new ArrayList<Object>();
		for (Object o : contents) {
			if (o instanceof Element || o instanceof String) {
				addContent(o);
			} else {
				throw new IllegalArgumentException("Element contents can only be elements or strings");
			}
		}
	}
	
	/** 
	 * Create an element with given names, attributes and contents.
	 * @param name name of element, must not be null
	 * @param attrs attribute name value pairs, none of which can be null
	 * @param contents strings and elements to be nested.
	 * @throws IllegalArgumentException if something other than a string or element
	 * is used in the contents or if an null attribute name or value occurs  
	 */
	public Element(String name, Map<String,String> attrs, Object... contents) {
		this(name,contents);
		for (Map.Entry<String,String> e : attrs.entrySet()) {
			if (e.getValue() == null) throw new IllegalArgumentException("no null attribute values permitted");
			setAttr(e.getKey(),e.getValue());
		}
	}
	
	/** Return name of element.
	 * @return name of element.
	 */
	public String getName() { return name; }
	
	/**
	 * Return the binding of this attribute, or null if no such attribute
	 * @param aname name of attribute
	 * @return binding of attribute or null if no such attribute
	 */
	public String getAttr(String aname) {
		if (attrs == null) return null;
		return attrs.get(aname);
	}
	
	/**
	 * Set or modify the binding of an attribute.
	 * @param aname attribute name, must not be null
	 * @param avalue attribute value, if null then the binding is removed
	 * @return the old value (if any) of the binding
	 */
	public String setAttr(String aname, String avalue) {
		if (aname == null) throw new IllegalArgumentException("attribute name must not be null");
		if (attrs == null) attrs = new HashMap<String,String>();
		_savedHashCode = 0;
		if (avalue == null) return attrs.remove(aname);
		return attrs.put(aname, avalue);
	}
	
	/**
	 * Add text or sub-element to this element.
	 * @param o either a string or an element, must not be null
	 */
	public void addContent(Object o) {
		if (!(o instanceof Element) && !(o instanceof String)) {
			throw new IllegalArgumentException("can only add text or elements");
		}
		if (contents == null) contents = new ArrayList<Object>();
		contents.add(o);
		_savedHashCode = 0;
	}
	
	/**
	 * Return an unmodifiable map of attribute->value pairs.
	 * The result is never null. 
	 * @return map of attribute names to values
	 */
	public Map<String,String> attrMap() {
		if (attrs == null) return Collections.emptyMap();
		return Collections.unmodifiableMap(attrs);
	}
	
	/**
	 * Return a list of the sub-elements.
	 * The result is never null, and contains only strings and {@link Element} objects.
	 * @return list of contents of this element
	 */
	public List<Object> contentList() {
		if (contents == null) return Collections.emptyList();
		return Collections.unmodifiableList(contents);
	}
	
	@Override 
	public String toString() {
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		print(pw,0);
		pw.flush();
		return sw.toString();
	}
	
	/**
	 * Print the element in indented fashion to the print writer.
	 * @param p print writer to print to
	 * @param indent current indentation for the element
	 */
	public void print(PrintWriter p, int indent) {
		for (int i=0; i < indent; ++i) {
			p.print("  ");
		}
		p.print(name);
		if (attrs != null) {
			for (Map.Entry<String,String> e : attrs.entrySet()) {
				p.print(" ");
				p.print(e.getKey());
				p.print("=");
				p.print(e.getValue());
			}
		}
		p.println();
		if (contents != null) {
			for (Object x : contents) {
				if (x instanceof Element) {
					((Element)x).print(p, indent+1);
				} else {
					for (int i=0; i <= indent; ++i) {
						p.print("  ");
					}
					p.println(x);
				}
			}
		}
	}
	
	private int _savedHashCode = 0;
	
	@Override
	public int hashCode() {
		if (_savedHashCode != 0) return _savedHashCode;
		_savedHashCode = name.hashCode() + (attrs == null ? 0 : attrs.hashCode()) +
			(contents == null ? 0 : contents.size() * 83);
		return _savedHashCode;
	}
	
	@Override
	public boolean equals(Object x) {
		if (!(x instanceof Element)) return false;
		Element e = (Element)x;
		if (!name.equals(e.name)) return false;
		if (attrs == null) {
			if (e.attrs != null && !e.attrs.isEmpty()) return false;
		} else {
			if (e.attrs == null) {
				if (!attrs.isEmpty()) return false;
			} else {
				if (!attrs.equals(e.attrs)) return false;
			}
		}
		if (contents == null) {
			if (e.contents != null && !e.contents.isEmpty()) return false;
		} else {
			if (e.contents == null) {
				if (!contents.isEmpty()) return false;
			} else {
				if (!contents.equals(e.contents)) return false;
			}
		}
		return true;
	}

	public static String diff(Element e1, Element e2) {
		if (e1 == e2) return null;
		if (e1 == null) return "not null";
		if (e2 == null) return null;
		if (!e1.getName().equals(e2.getName())) {
			return "Expected element type: " + e1.getName();
		}
		Map<String,String> attr1 = e1.attrMap();
		Map<String,String> attr2 = e2.attrMap();
		for (Map.Entry<String,String> en1 : attr1.entrySet()) {
			if (!attr2.containsKey(en1.getKey())) {
				return "Expected attribute " + en1.getKey();
			}
			if (!attr2.get(en1.getKey()).equals(en1.getValue())) {
				return "Expected attribute has wrong value for " + en1.getKey() + 
						": " + attr2.get(en1.getKey());
			}
		}
		for (Map.Entry<String,String> en2 : attr2.entrySet()) {
			if (!attr1.containsKey(en2.getKey())) {
				return "Unexpected attribute " + en2.getKey();
			}
		}
		List<Object> cts1 = e1.contentList();
		List<Object> cts2 = e2.contentList();
		if (cts1.size() != cts2.size()) {
			return "Wrong number of contents in " + e1.getName() + ", expected " +
					cts1.size() + ", found " + cts2.size();
		}
		int n = cts1.size();
		for (int i=0; i < n; ++i) {
			Object o1 = cts1.get(i);
			Object o2 = cts2.get(i);
			if (o1.getClass() != o2.getClass()) {
				return "Wrong type for contents[" + i + "] for element " + e1.getName() +
						": " + o2;
			}
			if (o1.equals(o2)) continue;
			if (o1 instanceof String) {
				String s1 = ((String) o1).trim();
				String s2 = ((String) o2).trim();
				if   (!s1.equals(s2))
					return "Expected '" + s1 + "' found '" + s2 + "'";
			} else if (o1 instanceof Element) {
				return diff((Element)o1,(Element)o2);
			}
		}
		return null;
	}
}
