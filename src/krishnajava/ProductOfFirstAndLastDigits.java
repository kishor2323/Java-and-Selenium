package krishnajava;

import java.util.Scanner;

public class ProductOfFirstAndLastDigits {

	public static void main(String[] args) {


		System.out.println("Please enter the number : ");

		 Scanner scan = new Scanner(System.in);
			
			int num=scan.nextInt();
			
            System.out.println("First Digit is "+getFirstDigit(num));
			
			System.out.println("Last Digit is "+getLastDigit(num));
			
			productOfFirstAndLastDigit(num);


	}


	private static int getFirstDigit(int num) {
		
		
		
		 while(num>=10) {
			 
			   num=num/10;
			   
			  // num/=10;
			   
		   }
		   return num;
		
		
	}
	

	private static int getLastDigit(int num) {
		
		
		return num%10;
		
	}

	private static void productOfFirstAndLastDigit(int num) {
		
		int firstDigit=getFirstDigit(num);
		int lastDigit=getLastDigit(num);
		int product=firstDigit*lastDigit;
		System.out.println("Product Of First And Last Digit is : "+product);



		
		
	}

	}


