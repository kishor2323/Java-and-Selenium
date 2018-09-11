package krishnajava;

import java.util.Scanner;

public class Natural {

	public static void main(String[] args) throws InterruptedException {


		System.out.println("please enter the no: ");
		
		Scanner scan2=new Scanner(System.in);
		
		int num2=scan2.nextInt();
		
       System.out.println("The First "+num2+" Natural no.s are: ");
		
		
		for(int i=1;i<=num2;i++)
		{
			System.out.println(i);
			
			Thread.sleep(1000);
			
		}
		

	}

}
