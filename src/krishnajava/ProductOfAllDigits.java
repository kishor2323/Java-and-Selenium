package krishnajava;

import java.util.Scanner;

public class ProductOfAllDigits {

	public static void main(String[] args) {


		System.out.println("Please enter the number : ");

		 Scanner scan = new Scanner(System.in);
			
			int num=scan.nextInt();
			
			int product=1;
			
			while(num>0) {
				
				int remainder=num%10;
				
				product=product*remainder;
				
				num=num/10;
			}
			
			System.out.println("Product Of All Digits in a Number is : "+product);

	}

}
