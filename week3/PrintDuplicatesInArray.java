package day2.week3;

import java.util.Set;
import java.util.TreeSet;

//The pseudocode has steps to implement using arrays.
//But, now do the same set of programs using Collections.
//int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
// get the length of the array
// declare an int variable named count
// iterate from 0 to the array length-1 (outer loop starts here)
// assign 0 to count 
// iterate from i to the length of the array by adding 1 to it (inner loop starts here)
// compare both the loop variables & check they're equal
// increase the count if both the arrays are equal
// Out of the inner loop, check and print the first array variable if count is more than 0

public class PrintDuplicatesInArray {
	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		Set<Integer> nums=new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			boolean dup=nums.add(arr[i]);
			if(dup==false) {
				System.out.println(arr[i]);
			}
		}
		
		
	}

}
