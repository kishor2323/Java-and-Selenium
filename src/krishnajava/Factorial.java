package krishnajava;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {


System.out.println("please enter the no: ");
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		 
		int fact=1;
			
		 for (int i = 1; i <= num; i++)
		 {
			    fact = fact * i;
		 }
			
		 System.out.println("The Factorial of " +num+ " is "+fact);

	}

}
