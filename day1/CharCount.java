package week3.day1;

public class CharCount {
	public static void main(String[] args) {
		String name="Surendar";
		char[] char1 = name.toCharArray();
		char letter='s';
		int count=0;
		for(int i=0;i<char1.length;i++) 
			if(char1[i]==letter) {
				count++;
			}
				System.out.println("The count is"+count);
			}
				
		}
			
			
	


