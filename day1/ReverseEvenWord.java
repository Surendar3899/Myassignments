package week3.day1;

public class ReverseEvenWord {
	/*
	 * 
	 * /*Class Room:2
     * String input="Testleaf  located in chennai";
     * convert the string into words[]//split
     * check if the word is odd  or even index(i%2!=0)
     * if it even index-->Reverse the string
     * print the output
     * 
     */
	public static void main(String[] args) {
		String str="Testleaf located in chennai";
		String[] str1 = str.split(" ");
		for(int i=0;i<str1.length;i++) {
			if(i%2==0) {
				//System.out.println(str1[i]+ " is even word");
				char[] char1 = str1[i].toCharArray();
				for(int j=char1.length-1;j>=0;j--)
					System.out.println(char1[j]);
			}
			else {
				//System.out.println(str1[i]+ " is not even word");
				System.out.println(str1[i]);
			}
		}
		
		
		
		
		
	}
		
	}