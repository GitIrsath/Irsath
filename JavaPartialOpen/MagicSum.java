package smartgraduates;

import java.util.Scanner;

public class MagicSum {

	public static void main(String[] args) {
		final int SENTINEL=-1;
		int numberin;
		int sum=0;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Positive Integer (or -1 to end) : ");
		numberin=scan.nextInt();
		
		while(numberin!=SENTINEL) {
			if(haseight(numberin)) {
				sum+=numberin;
			}
			System.out.println("Enter a Positive Integer (or -1 to end) : ");
			numberin=scan.nextInt();
		}
		
		System.out.println("The magic sum is : "+sum);
	}
	public static boolean haseight(int num) {
		while(num!=0) {
			if(num%10==8) {
				return true;
			}
			num/=10;
		}
		
		
		return false;
	}
	
			

}
