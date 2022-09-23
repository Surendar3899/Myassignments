package day1.week3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		String str1="post";
		String str2="stop";
		int length1 = str1.length();
		int length2 = str2.length();
		char[] char1 = str1.toCharArray();
		char[] char2 = str2.toCharArray();
		Arrays.sort(char1);
		Arrays.sort(char2);
		for(int i=0;i<char1.length;i++){
		if(Arrays.equals(char1, char2))
		{
			System.out.println("Anagram");
			break;
		}
		else
			System.out.println("Not anagram");
				
	}

	}}
