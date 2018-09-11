package krishnajava;

import java.util.Scanner;

public class WholeNum {

	public static void main(String[] args) {


		System.out.println("Please enter the number : ");
		
		Scanner scan=new Scanner(System.in);
		
		int num=scan.nextInt();
		
		for(int i=0;i<=num;i++) {
			
			System.out.println(i);
		}

	}

}
