package day2.week3;
/*The pseudocode has steps to implement using arrays.
*But, now do the same set of programs using Collections.
*Here is the input
*int[] arr = {1,2,3,4,7,6,8};
*Sort the array	
*loop through the array (start i from arr[0] till the length of the array)
*check if the iterator variable is not equal to the array values respectively
*print the number
*once printed break the iteration
*/

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		List<Integer> nums=new ArrayList<Integer>();
		for(int i=0;i<=arr.length;i++) {
			nums.add(arr[i]);
			Collections.sort(nums);
			if(nums.get(i)!=(i+1)) {
				System.out.println(i+1);
				break;
				
			}
			
			
		}
		
		
	}

}
