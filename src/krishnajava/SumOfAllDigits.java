package krishnajava;

import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) {
		
		System.out.println("Please enter the number : ");

		 Scanner scan = new Scanner(System.in);
			
			int num=scan.nextInt();
			
			int sum=0;
			
			while(num>0) {
				
				int remainder=num%10;
				
				sum=sum+remainder;
				
				num=num/10;
			}
			
			System.out.println("Sum Of All Digits in a Number is : "+sum);
	}

}
