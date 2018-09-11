package krishnajava;

import java.util.Scanner;

public class GivenEven {

	public static void main(String[] args) {
		
		
		System.out.println("Enter The Number : ");
		
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();
		
		
		
		if(num%2==0) 
		{
			 System.out.println("The Given Number Is Even Number");
		 }
		else
		{
			 System.out.println("The Given Number Is Odd Number");
		 }
			
	}
}