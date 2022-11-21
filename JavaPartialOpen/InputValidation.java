package smartgraduates;

import java.util.Scanner;

public class InputValidation {

	public static void main(String[] args) {
		int numberin=0;
		boolean isvalid;
		
		
		Scanner scan=new Scanner(System.in);
		
		isvalid=false;
		do {
			System.out.println("Enter a number between 0-10 or 90-100 : ");
			numberin=scan.nextInt();
			
			if((numberin>=0 && numberin<=10) || (numberin>=90 && numberin<=100)) {
				isvalid=true;
			}else {
				System.out.println("Invalid Input...");
			}
		}while(!isvalid);
			System.out.println("You have Entered : " + numberin);
	}

}
