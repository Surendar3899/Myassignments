package day2.week3;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class FindIntersection {
	/*The pseudocode has steps to implement using arrays.
	*But, now do the same set of programs using Collections. 
	* Pseudo Code
	
	 * a) Declare An array for {3,2,11,4,6,7};	 
	 * b) Declare another array for {1,2,8,4,9,7};
	 * c) Declare for loop iterator from 0 to array length
	 * d) Declare a nested for another array from 0 to array length
	 * e) Compare Both the arrays using a condition statement
	 
	 *  f) Print the first array (shoud match item in both arrays)
	 */
	public static void main(String[] args) {
		int[] a={3,2,11,4,6,7};
		int[] b={1,2,8,4,9,7};
		List<Integer> numa=new ArrayList<Integer>();
		List<Integer> numb=new ArrayList<Integer>();
		for(int i=0;i<a.length;i++) {
			//for(int j=0;j<b.length;j++) {
			numa.add(a[i]);
			numb.add(b[i]);
			}
			for(int k=0;k<numa.size();k++) {
				for(int l=0;l<numb.size();l++) {
					if(numa.get(k)==numb.get(l)) {
						System.out.println(numa.get(k));
						break;
					
			}
					
		
	}

	}}}

