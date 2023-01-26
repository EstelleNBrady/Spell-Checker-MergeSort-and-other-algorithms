import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.uwm.cs.junit.LockedTestCase;
import edu.uwm.cs351.SpellCheck;
import edu.uwm.cs351.util.Element;


public class TestSpellCheck extends LockedTestCase {

	SpellCheck sc;
	List<String> bad;
	
	// create attributes
	protected Map<String,String> a(String... as) {
		Map<String,String> result = new LinkedHashMap<>();
		for (int i=0; i+1 < as.length; i += 2) {
			result.put(as[i], as[i+1]);
		}
		return result;
	}
	
	@Override
	protected void setUp() throws Exception {
		sc = new SpellCheck();
	}
	
	
	/// Locked test
	
	public void test() {
		// NB: a("attr","value") creates attributes like 'attr = "value"'
		// that can occur in HTML/XML elements.
		bad = sc.check(new Element("html",
				new Element("head"),
				new Element("body",
						new Element("script",a("lang","javascript"),"foo=bar.baz"),
						new Element("h1","This header has a Tyypo; and it was Capitalized."),
						new Element("p",a("tabindex","0"),"tumtum tree: horticulture."))));
		// These are not in the dictionary:
		// html, lang, javascript, foo, baz, h1, Tyypo, p, tabindex, tumtum
		// but not all of these will be reported.  Which ones?
		// Read the assignment!
		List<String> good = new ArrayList<>();
		good.add("head"); good.add("body"); good.add("header");
		assertEquals("[head, body, header]", good.toString());
		bad.sort(String.CASE_INSENSITIVE_ORDER);
		assertEquals(Ts(2061695821), bad.toString()); // sorted case insensitively
	}

	
	/// Regular tests
	
	public void test0() {
		bad = sc.check(new Element("html",""));
		assertEquals(0,bad.size());
	}
	
	public void test1() {
		bad = sc.check(new Element("p","One"));
		assertEquals(0,bad.size());
	}
	
	public void test2() {
		bad = sc.check(new Element("p","Ooone"));
		assertEquals(1,bad.size());
		assertEquals("Ooone",bad.get(0));
	}
	
	public void test3() {
		bad = sc.check(new Element("p","Go home"));
		assertEquals(0,bad.size());
	}
	
	public void test4() {
		bad = sc.check(new Element("p"," Go home. "));
		assertEquals(0,bad.size());
	}
	
	public void test5() {
		bad = sc.check(new Element("h1","Goooo west, young man."));
		assertEquals(1,bad.size());
		assertEquals("Goooo",bad.get(0));
	}
	
	public void test6() {
		bad = sc.check(new Element("p","Vladimir Putin called Joseph Biden"));
		assertEquals(0,bad.size());
	}
	
	public void test7() {
		bad = sc.check(new Element("script","js.inc(tv);"));
		assertEquals(0,bad.size());
	}
	
	public void test8() {
		bad = sc.check(new Element("style","head.font = RED;", " docfont = ITALIC"));
		assertEquals(0,bad.size());
	}
	
	Element e2 = new Element("title","Test");
	Element e1 = new Element("head",e2);
	Element e5 = new Element("em","First");
	Element e4 = new Element("h1",e5,"heading");
	Element e7 = new Element("b","bold,");
	Element e8 = new Element("i","italic.");
	Element e10 = new Element("em","bold");
	Element e11 = new Element("i","italic.");
	Element e9 = new Element("b",e10,e11);
	Element e13 = new Element("em","unusually mimsy");
	Element e15 = new Element("em","emphasis.");
	Element e14 = new Element("b","bold ",e15);
	Element e12 = new Element("em","Important: emphasis nests ",e13,"even\n",e14);
	Element e17 = new Element("font",a("size","-1"),"smaller,");
	Element e18 = new Element("font",a("size","40"),"large");
	Element e19 = new Element("font",a("size","+1"),"temporarilly");
	Element e20 = new Element("b","increase");
	Element e21 = new Element("font",a("size","5"),"veeery small.");
	Element e16 = new Element("font",a("size","-1"),"Sometimes however, the xfont becomes ",e17,"although ",e18,"words can occur and\nwe can ",e19,e20,"the size or make it\n",e21);
	Element e6 = new Element("p","A paragraph of lixome words, some ",e7,"others ",e8,"We also have some in ",e9,e12,e16);
	Element e22 = new Element("h3","Note:");
	Element e26 = new Element("li","Bullets can be italic");
	Element e28 = new Element("em","plain");
	Element e27 = new Element("li","A ",e28,"text stands out.","");
	Element e30 = new Element("i","italic");
	Element e29 = new Element("li","But an ",e30,"test does not.");
	Element e32 = new Element("b","Bold");
	Element e31 = new Element("li",e32,"text is obvious.");
	Element e25 = new Element("ul",e26,e27,new Element("script","This should not badbad appear"),e29,e31);
	Element e24 = new Element("em","We have the following points:\n",e25);
	Element e33 = new Element("br");
	Element e36 = new Element("li","In October, the Obama's visited Oaxaca.");
	Element e37 = new Element("li","Lowercase obama is not allowed.");
	Element e38 = new Element("li");
	Element e39 = new Element("b","Bold");
	Element e35 = new Element("ol",e36,"Unfortunately numbered lists are hard to handle.\n",e37,"So just treat them as though unnumbered.\n",e38,e39,"text does not stand out.\n");
	Element e34 = new Element("b",e35);
	Element e23 = new Element("p",e24,e33,e34);
	Element e3 = new Element("body",new Element("style","This also should never nixno appear"),e4,e6,e22,e23);
	Element e0 = new Element("html",e1,e3);
	
	public void test9() {
		bad = sc.check(e0);
		assertEquals("lixome",bad.get(0));
		assertEquals("mimsy",bad.get(1));
		assertEquals("obama",bad.get(2));
		assertEquals("temporarilly",bad.get(3));
		assertEquals("veeery",bad.get(4));
		assertEquals("xfont",bad.get(5));
	}
}
