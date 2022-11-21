package closedbook;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		int numberin;
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		numberin=scan.nextInt();
		
		for(int i=1;i<=numberin/2;++i) {
			if(numberin%i==0) {
			  count++;	
			}
			
		}
		if(count==1) {
			System.out.println(numberin+" is a Prime Number...");
		}else {
			System.out.println(numberin+" is not a Prime Number...");
		}
		scan.close();
	}

}
