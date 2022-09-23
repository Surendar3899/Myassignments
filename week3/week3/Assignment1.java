package day1.week3;

public class Assignment1 {
	/*
	 Pseudo Code
	 
	 * Declare String Input as Follow
	  
	 * String test = "changeme";
	 
	 * a) Convert the String to character array
	 
	 * b) Traverse through each character (using loop)
	 
	 * c)find the odd index within the loop (use mod operator)
	 
	 * d)within the loop, change the character to uppercase, if the index is odd else don't change
	  
	 */
	public static void main(String[] args) {
		String test = "changeme";
		char[] char1 = test.toCharArray();
		for(int i=0;i<char1.length;i++) {
			if(i%2!=0) {
				char upperCase = Character.toUpperCase(char1[i]);
				System.out.println(upperCase);
		
		
	}

}}}
