package krishnajava;

import java.util.Scanner;

public class StringConversion {

	public static void main(String[] args) {



		System.out.println("Please Enter The Number : ");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		printFirstAndLastDigitUsingStringConversion(num);

	}

	private static void printFirstAndLastDigitUsingStringConversion(int num) {
	    String numInString=Integer.toString(num);
	   	char firstDigit=numInString.charAt(0);
		char lastDigit=numInString.charAt(numInString.length()-1);
		System.out.println("First Digit is : "+firstDigit);
		System.out.println("Last  Digit is : "+lastDigit);
		
	   
  }

}
