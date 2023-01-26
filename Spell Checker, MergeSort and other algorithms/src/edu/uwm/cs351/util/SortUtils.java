//Estelle Brady
//CS - 351 - 401
//collaborated with Miguel Garcia, Christian, Marwan Salama

package edu.uwm.cs351.util;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;



/**
 * An class with utility code for sorting and using sorted arrays.
 * @param K type of keys
 */
public class SortUtils<T>{
	private Comparator<T> comparator;

	/**
	 * Create an instance using the given comparator.  If it is null, use
	 * natural ordering assuming the type is comparable (`compareTo`).
	 * @param c comparator, or if null, use natural ordering
	 */
	@SuppressWarnings("unchecked")
	public SortUtils(Comparator<T> c) {
		if (c == null) {
			c = (o1,o2) -> ((Comparable<T>)o1).compareTo(o2);
		}
		comparator = c;
	}

	/** merge sort the elements of the array
	 * @param array must not be null
	 */
	public void mergeSort(T[] array) {
		mergeSortKeep(0, array.length,array,array.clone());
	}

	/** Merge sort "in" array between lo and hi and put results in "out".
	 * The "in" array will be used for scratch in the same range.
	 * @param lo >= 0
	 * @param hi >= lo
	 * @param in must not be null
	 * @param out must not be null or same as in
	 */
	public void mergeSortMove(int lo, int hi, T[] in, T[] out) {
		if(hi!=lo) {
			//midpoint
			int mid = (lo+hi)/2;

			//sorting first half
			mergeSortKeep(lo, mid, in, out);

			//sorting second half
			mergeSortKeep(mid, hi, in, out);

			//connect 2 arrays back together
			merge(lo, mid, hi, in, out);
		}
	}

	/** merge sort "in" array between lo and hi in place using temp array for scratch
	 * @param lo >= 0
	 * @param hi >= lo
	 * @param data must not be null, length >= hi
	 * @param temp must not be null or same as data, length >= hi
	 */
	public void mergeSortKeep(int lo, int hi, T[] data, T[] temp) {

		int mid = lo+(hi - lo)/2;
		if (hi-lo>= 2) {
			//sort second half of array
			mergeSortKeep(mid, hi, data, temp);
			//sort first half
			mergeSortKeep(lo, mid, data, temp);
			//merge the halves back together
			merge(lo, mid, hi, data, temp);

			//copy over elements to the other array
			while(lo!=hi){
				data[lo] = temp[lo++];
			}
		}
	}

	/** merge sorted lists in [lo,mid) and [mid,hi) in "in" into [lo,hi) in "out".
	 * @param lo >= 0
	 * @param mid >= lo
	 * @param hi >= mid
	 * @param in must not be null, length >= hi
	 * @param out must not be null or same as in, length >= hi
	 */
	public void merge(int lo, int mid, int hi, T[] in, T[] out) {
		int a = lo;
		int b = mid;

		for (int i = lo; i < hi; ++i) {
			if ((a+1 <= mid) && ((b >= hi) || (comparator.compare(in[a], in[b]) <= 0))){
				//we bring it to the output
				out[i] = in[a];
				//move
				a++;
			} else {
				//copy to output
				out[i] = in[b];
				//move mid
				b++; 
			}
		}
	}

	/** Write elements from sorted array in range [lo1,hi1)
	 * into out [lo1,...] as long as they
	 * don't occur in sorted array rem in range [lo2,hi2).  
	 * The result (out) will also be sorted.  
	 * @param lo1 >= 0
	 * @param hi1 >= lo1
	 * @param lo2 >= 0
	 * @param hi2 >= lo2
	 * @param in must not be null, length >= hi1
	 * @param rem must not be null, length >= hi2
	 * @param out must not be null, length >= hi1.
	 * The array out may be the same as the in, but not the same as rem.
	 * @return the index after the last element added into out.
	 */
	public int difference(int lo1, int hi1, int lo2, int hi2, T[] in, T[] rem, T[] out) {
		int templo1 = lo1;
		while (lo1 < hi1 && lo2 < hi2) {
			//if lo2 goes before
			if (comparator.compare(rem[lo2], in[lo1])<0) {
				lo2++;//increment
			} else if (comparator.compare(rem[lo2], in[lo1])==0) {
				lo1++;
			} else {
				out[templo1++] = in[lo1++];
			}
		}
		while (!(lo1 == hi1)) {
			out[templo1++] = in[lo1++];
		}
		return templo1;
	}


	public int uniq(T[] array) {

		Set<T> set = new HashSet<>();
		int count = 0;
		for (T a : array) {
			if (!set.contains(a)) {

				set.add(a);
				count++;
			}
		}

		return count;
	}


	/**
	 * Remove duplicate elements (one with 0 comparison)
	 * from a sorted array range [lo,hi), writing the unique elements to
	 * the second array [lo,...).
	 * @param lo >= 0
	 * @param hi >= lo
	 * @param in must not be null
	 * @param out must not be null.  This array may be the same as in without problems.
	 * @return index after unique elements
	 */
	public int uniq(int lo, int hi, T[] in, T[] out) {

		if (hi == lo) return hi;

		int count = 1;

		for (int i = lo+1; i <= hi-1; ++i) {
			if (comparator.compare(in[i], in[i-1])< 0 || comparator.compare(in[i], in[i-1]) > 0) {
				out[lo + count] = in[i];
				++count;
			}
		}
		out[lo] = in[lo];
		return lo + count;
	}
}