package smartgraduates;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter a number :");
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println("The number you Entered is Even");
		}
		else {
			System.out.println("The number you Entered is Odd");
		}
		
	}

}
