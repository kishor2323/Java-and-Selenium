package krishnajava;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {


		System.out.println("Please Enter The Number : ");
		
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		
		int r,sum=0,temp;    
		
		  //It is the number variable to be checked for palindrome  
		  
		  temp=n;    
		 
		  while(n>0){  
			  
		   r=n%10;  //getting remainder 
		   
		   sum=(sum*10)+r;    
		   
		   n=n/10; 
		   
		  }   
		  
		  if(temp==sum)
			  
			  System.out.println("The Number is Palindrom Number ");
		  
			else
				
			System.out.println("The Number is not Palindrom Number ");
		}  

	}



