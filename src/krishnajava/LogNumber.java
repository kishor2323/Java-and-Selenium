package krishnajava;

import java.util.Scanner;

public class LogNumber {

	public static void main(String[] args) {

		System.out.println("Please Enter The Number : ");
		Scanner scan = new Scanner(System.in);
		int num=scan.nextInt();
		System.out.println(getLastDigitUsingLog(num));

	}

	private static int getLastDigitUsingLog(int num) {
		   int noOfDigits=(int) Math.log10(num);
		   int lastDigit=(int) (num/Math.pow(10, noOfDigits));
		   return lastDigit;
	   }

}
