package edu.uwm.cs351;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import edu.uwm.cs351.util.Element;
import edu.uwm.cs351.util.SortUtils;
import edu.uwm.cs351.util.XMLParseException;
import edu.uwm.cs351.util.XMLReader;
//Estelle Brady
//CS - 351 - 401
//collaborated with Miguel Garcia, Christian, Marwan Salama

public class SpellCheck {

	private final String[] dictionary;
	
	public SpellCheck() throws IOException {
		ArrayList<String> temp = new ArrayList<String>();
		InputStream is = new FileInputStream(new File("lib","dictionary.txt"));
		Reader r = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(r);
		String s;
		while ((s = br.readLine()) != null) {
			temp.add(s);
		}
		br.close();
		dictionary = temp.toArray(new String[temp.size()]);
	}
	
	/**
	 * Check the words in the given element.
	 * Return a list of all words that do not occur in the dictionary.
	 * @param e HTML element (ignore script and style tags!)
	 * @return non-null list of all words not occurring in the dictionary.
	 */
	public List<String> check(Element e) {
	
		List<String> wordz = helper(e, e.contentList());
		int capacity = wordz.size();
		String[] temp1 = wordz.toArray(new String[capacity]);
		SortUtils<Object> word = new SortUtils<>(null);
		    
		   
		    word.mergeSort(temp1);
		    word.uniq(temp1);
		    
		    List<String> stringList = Arrays.asList(temp1);
		    List<String> subList = stringList.subList(0, word.difference(0, temp1.length, 0, dictionary.length, temp1, dictionary, temp1));
		 
		    return subList;
		}
	
	private List<String> helper(Element aye, List<Object> in) {
	    // Create a list for the words
	    List<String> words = new ArrayList<>();

	    //check if it contains style or script
	    if (!(aye.getName() == "style")) {
	        if (!(aye.getName() == "script")) {
	        	//loop through the list
	            Iterator<Object> iterator = in.iterator();

	           //use has next to loop through
	            while (iterator.hasNext()) {
	                Object z = iterator.next();

	                //check if it is an instance of a string
	                if (z instanceof String) {
	                    String tempz = z.toString();

	                    //replace with a space
	                    for (char charr : new char[]{'.', '?', '"', ',', '|', ':', ';', '(', ')', '\n', '\r'}) {
	                        tempz = tempz.replace(charr, ' ');
	                    }

	                    //new string of split
	                    String[] diff = tempz.split(" ");

	                    //add 
	                    for (String w : diff) {
	                        if (!w.isEmpty()) {
	                            words.add(w);
	                        }
	                    }
	                } else {
	                    Element y = (Element) z;
	                    words.addAll(helper((Element)z, y.contentList()));
	                }
	            }
	        }
	    }

	    return words;
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		SpellCheck sc = new SpellCheck();
		for (String url : args) {
			System.out.println("Checking spelling of HTML in " + url);
			try {
				Reader r= new InputStreamReader(new BufferedInputStream(new URL(url).openStream()));
				final XMLReader t = new XMLReader(r);
				// t.addCDATA("script");
				Object next = t.readElement();
				if (next instanceof Element) { // could be null
					Element contents = (Element)next;
					if (!contents.getName().equalsIgnoreCase("html")) {
						throw new XMLParseException("element must be HTML not " + contents.getName());
					}
					System.out.println("Mispelled:");
					for (String s : sc.check(contents)) {
						System.out.println("  " + s);
					}
				} else {
					throw new XMLParseException("contents must be HTML, not " + next);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}