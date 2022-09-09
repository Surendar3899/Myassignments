package week1.day2.assisgnments;

public class Palindrome {
	public static void main(String[] args) {
		int num=121;//madam 34343
		int temp = num;
		int rev = 0;//3
		for (;num!=0;num=num/10) {

		
			
			rev= (rev*10)+num%10;//0+3
		}
		if (temp==rev) 
		{
		System.out.println("Palindrome number");	
		}
		else 
		{
			System.out.println("It is not a Palindrome Number");
		}
		
	}
	

}
