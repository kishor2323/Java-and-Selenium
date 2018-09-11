package krishnajava;

import java.util.Scanner;

public class LastDigitOfNum {

	public static void main(String[] args) {


System.out.println("please enter the no: ");
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		 while (num >= 10) 
		 {
	            num %= 10; 
		 }
		 
		 System.out.println("The Last Digit of a No.is "+num);

	}

}
