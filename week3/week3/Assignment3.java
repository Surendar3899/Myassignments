package day1.week3;

public class Assignment3 {
public static void main(String[] args) {

	/*
	 * Pseudo code 
	 
	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words	
	 */
String text = "We learn java basics as part of java sessions in java week1";
int count=0;
char[] Char = text.toCharArray();
String[] split1 = text.split(" ");
for (int i = 0; i < split1.length; i++) {
	for (int j = 1; j < i; j++) {
		if(split1[i].equals(split1[j])) {
		count++;
		break;
	}
	}
if(count==0) {//duplicate
	System.out.print(split1[i]+"");
	
}
else {
	count=0;


}	
		
	}
	
}



}




