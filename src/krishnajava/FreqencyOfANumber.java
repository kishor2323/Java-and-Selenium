package krishnajava;

import java.util.Scanner;

public class FreqencyOfANumber {

	public static void main(String[] args) {


		System.out.println("Please Enter The Number : ");
		Scanner scan = new Scanner(System.in);
		long num = scan.nextLong();

		printFrequencyOfEachDigit(num);
		

	}
	
	public static void printFrequencyOfEachDigit(long num) {
		int[] array =new int[10];
		
		while(num>0) {
			int reminder=(int) (num%10);
			array[reminder]=array[reminder]+1;
			num=num/10;
		}
		
		System.out.println("Frequency Of Each Digit");
		for(int i=0;i<=9;i++) {
			if(array[i]>0)
			System.out.println(i+" ---> "+array[i]);
		}
		
		
	}
}


