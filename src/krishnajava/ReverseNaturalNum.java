package krishnajava;

import java.util.Scanner;

public class ReverseNaturalNum {

	public static void main(String[] args) throws InterruptedException {
	
		System.out.println("enter the number:");
		
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();
		
		System.out.println("The First "+ num +" Natural Numbers InReverse are :");
		
		for(int i=num;i>=1;i--) {
			
			System.out.println(i);
			
			Thread.sleep(1000);
			

		}	

	}

}
