package week1.day2.assisgnments;

public class Fibonacci {
	public static void main(String[] args) {
		int val=8;
		int num1=0,num2=1,sum=0;
		System.out.println(num1);
		System.out.println(num2);
		for(int i=1;i<=val;i++) {
			sum=num1+num2;
			num1=num2;
		    num2=sum;	
		
		System.out.println(sum);
	}
		

}
}