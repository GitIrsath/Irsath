package closedbook;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		int n,sum=0;
		int numberin;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of values : ");
		n=scan.nextInt();
		
		
		System.out.print("Enter the values (Separated by spaces) : ");
		for(int i=1;i<=n;++i) {
			numberin=scan.nextInt();
			sum+=numberin;
		}
		
		System.out.printf("The Average of the numbers is : %.2f",average(sum,n));
scan.close();
	}
	public static double average(int sum,int n) {
		
		return (double)sum/n;
	}
}
