package day2.week3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*The pseudocode has steps to implement using arrays.
*But, now do the same set of programs using Collections. 
* Pseudo Code
*Pseudo Code:
*1) Arrange the array in ascending order
 *2) Pick the 2nd element from the last and print it
*/
public class FindSecondLargest {
	public static void main(String[] args) {
	int[]a= {3,6,5,2,1,4};
	List<Integer> nums=new ArrayList<Integer>();
	for(int i=0;i<a.length;i++) {
		nums.add(a[i]);}
		//System.out.println(nums);
		Collections.sort(nums);
		System.out.println(nums);
		//System.out.println(nums.isEmpty());
		System.out.println(nums.size()-1);
		
		
	}
	
	

}
