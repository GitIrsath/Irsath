package smartgraduates;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		Scanner scan=new Scanner(System.in);
		int nu1=scan.nextInt();
		
		
		
		if(nu1%2==0) {
			System.out.println(nu1+" is Even");
		}
		else {
			System.out.println(nu1+" is Odd");
		}
		}
	}


