package krishnajava;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {


System.out.println("please enter the no: ");
		
		Scanner scan=new Scanner(System.in);
		
		int num1=scan.nextInt();
		
       System.out.println("The First "+num1+" Even no.s are: ");
		
		int nexteven=2;
		
		for(int i=1;i<=num1;i++)
		{
			System.out.println(nexteven);
			
			nexteven=nexteven+2;
		}

	}

}
