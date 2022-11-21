package smartgraduates;

import java.util.Scanner;

public class SumDigitsInt {

	public static void main(String[] args) {
		int inNumber,inDigitsum=0;
		  int inDigit;
		  
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a Positive Number : ");
		  inNumber=scan.nextInt();
		  
		  while(inNumber>0) {
			  inDigitsum += inNumber%10;
			  
			  inNumber /= 10;
		  }
		  System.out.println("The sum is : "+inDigitsum);
	}

}
