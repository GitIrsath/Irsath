package smartgraduates;

import java.util.Scanner;

public class Basic2 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First value : ");
		int i=scan.nextInt();
		
		System.out.println("Enter the Second value : ");
		int j=scan.nextInt();
		
		int mul=i*j;
		System.out.println("The Multiplication of two numbers is : "+mul);

	}

}
