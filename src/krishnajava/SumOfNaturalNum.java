package krishnajava;

import java.util.Scanner;

public class SumOfNaturalNum {

	public static void main(String[] args) {


		System.out.println("Enter The Number : ");
		
		Scanner scan = new Scanner(System.in);
		
		int num=scan.nextInt();

	       int sum=0;
	       
		/*for(int i=1;i<=num; i++)
	        {
	           
			sum=sum+i;
			 
	        }
		       System.out.println("Sum = " + sum);*/
	       
	       int i=1;
	       
	       while(i<=num)
	       {
	    	   sum=sum+i;
	    	   i++;
	       }
	        
	       System.out.println("Sum is "+sum);
	    }
		

	}

