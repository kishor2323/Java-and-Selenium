package krishnajava;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {


		
			int num;
		      Scanner scan = new Scanner(System.in);
		      System.out.println("Enter a number to check whether it is an Armstrong number or not ?");      
		      num = scan.nextInt();
		 
		      boolean isArmStrong=isArmStrongNumber(num);
		 
		      if (isArmStrong)
		         System.out.println(num + " is an Armstrong number.");
		      else
		         System.out.println(num + " isn't an Armstrong number.");  

		}
		
		static int power(int num, int noOfTimes) {
		      int c, p = 1;
		 
		      for (c = 1; c <= noOfTimes; c++) 
		         p = p*num;
		 
		      return p;   
		   }
		
		public static boolean isArmStrongNumber(int num){
			
			int sum = 0, temp, remainder, digits = 0;
			  temp = num;
			  

		      while (temp != 0) {
		         digits++;
		         temp = temp/10;
		      }
		 
		      temp = num;
		 
		      while (temp != 0) {
		         remainder = temp%10;
		         sum = sum + power(remainder, digits);
		         temp = temp/10;
		      }
		 
		      if (num == sum)
		         return true;
		      return false;
		}
		
		    
			
			
		}




	


