package krishnajava;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {


		System.out.println("Enter the number : ");
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		System.out.println("The first " +num+ " Odd Numbers are ");
		
		int nextOdd=1;
		
		for(int i=1; i<=num; i++) {
			
			System.out.println(nextOdd);
			
			nextOdd=nextOdd+2;
			
			
		}

	}

}
