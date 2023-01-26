import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import junit.framework.TestCase;
import edu.uwm.cs351.SpellCheck;
import edu.uwm.cs351.util.Element;
import edu.uwm.cs351.util.SortUtils;


public class TestEfficiency extends TestCase {
	SortUtils<Integer> sort;

	protected void setUp() throws Exception {
		super.setUp();
		sort = new SortUtils<Integer>(TestUtil.reverse(TestUtil.<Integer>defaultComparator()));
	}

	private static final int SIZE = 1000000;
	
	public void testMergeSort() {
		Random r = new Random();
		Integer[] array = new Integer[SIZE];
		for (int i=0; i < SIZE; ++i) {
			array[i] = r.nextInt();
		}
		sort.mergeSort(array);	
	}
	
	public void testDifference() {
		Integer[] array1 = new Integer[SIZE];
		Integer[] array2 = new Integer[SIZE];
		Integer[] array3 = new Integer[2];
		
		for (int i=0; i < SIZE; ++i) {
			array1[i] = SIZE-i+1;
			array2[i] = SIZE-i-1;
		}
		
		assertEquals(2,sort.difference(0, SIZE, 0, SIZE, array1, array2, array3));
	}
	
	public void testUniq() {
		Integer[] array = new Integer[SIZE];
		int i=0;
		int j=0;
		for (j=0; i < SIZE; ++j) {
			for (int k=0; k < j && i < SIZE; ++k) {
				array[i++] = SIZE-j;
			}
		}
		
		assertEquals(j-1,sort.uniq(array));
	}
	
	public void testSpellCheck() {
		try {
			ArrayList<Element> temp = new ArrayList<Element>();
			InputStream is = new FileInputStream(new File("lib","dictionary.txt"));
			Reader r = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(r);
			String s;
			while ((s = br.readLine()) != null) {
				temp.add(new Element("p",s));
			}
			br.close();
			Element monster = new Element("p",temp.toArray());
			monster.addContent("Bloop");
			SpellCheck sc = new SpellCheck();
			List<String> bad = sc.check(monster);
			assertEquals(1,bad.size());
			assertEquals("Bloop",bad.get(0));
		} catch (FileNotFoundException e) {
			assertFalse("Can't read dictionar?",true);
		} catch (IOException e) {
			assertEquals(null,e);
		}

	}
}
