package krishnajava;

import java.util.Scanner;

public class PrintAllDigits {

	public static void main(String[] args) {



		System.out.println("Please enter the number : ");

		 Scanner scan = new Scanner(System.in);
			
			int num=scan.nextInt();
			
			System.out.println("Digits of a number are : ");
			while(num>0) {
				System.out.print(num%10+" ");
				num=num/10;
			}
			


	}

}
