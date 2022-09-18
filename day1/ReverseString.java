package week3.day1;

public class ReverseString {
	/*
	 * Classroom Assignment 1 A: Reverse the String-Name
     *Goal: To understand the String, loop
      *a) Create a class by name: ReverseString (with main method) in same package
      *b) Write a logic to reverse a String
      * c) Run and Confirm the reversed String is printed in console
      *Hint: Convert the String to characters, get the characters in reverse order and 
      *print every character without white space.
      * Time to given: 10 - 15 minutes.
	 */
	public static void main(String[] args) {
		String name="Surendar";
		char[] ch1 = name.toCharArray();
		for(int i=ch1.length-1;i>=0;i--) {
			System.out.print(ch1[i]);
			
			
		}
			
	}

}
