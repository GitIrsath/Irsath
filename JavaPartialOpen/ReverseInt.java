package smartgraduates;

import java.util.Scanner;

public class ReverseInt {

	public static void main(String[] args) {
		  int inNumber;
		  int inDigit;
		  
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a Positive Number : ");
		  inNumber=scan.nextInt();
		  
		  while(inNumber>0) {
			  inDigit = inNumber%10;
			  System.out.print(inDigit);
			  inNumber /= 10;
		  }
		 
	}

}
