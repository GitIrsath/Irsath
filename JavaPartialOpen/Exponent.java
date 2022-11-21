package smartgraduates;

import java.util.Scanner;

public class Exponent {

	public static void main(String[] args) {
		int base;
		int exp;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the base : ");
		base=scan.nextInt();
		
		System.out.println("Enter the Exponent : ");
		exp=scan.nextInt();
		
		System.out.println(base +" raises to the power "+exp+" is "+exponent(base,exp));
	}
	
	public static int exponent(int base,int exp) {
		int product=1;
		
		for(int i=0;i<exp;++i) {
			product*=base;
			
		}
		return product;
	}

}	
	
