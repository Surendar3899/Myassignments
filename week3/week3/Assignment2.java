package day1.week3;

public class Assignment2 {
	//Build a logic to find the given string is palindrome or not
    
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
		 
		 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
		 */
	public static void main(String[] args) {
		String str="madam";
		String rev="";
		char[] Char = str.toCharArray();
		for(int i=Char.length-1;i>=0;i--) {
			rev=rev+Char[i];
		}
			if(str.equals(rev)) {
			System.out.println(rev);
		}
		else {
				System.out.println("This is not palindrome");
			}
		}
		
}