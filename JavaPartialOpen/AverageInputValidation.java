package smartgraduates;

import java.util.Scanner;

public class AverageInputValidation {

	public static void main(String[] args) {
		final int NUM_STUDENTS=3;
		
		int numberin;
		boolean isvalid;
		int sum=0;
		double average;
		
		Scanner scan=new Scanner(System.in);
		
		for(int student = 1;student<=NUM_STUDENTS;++student) {
				isvalid=false;
				
				do {
					System.out.print("Enter the Student "+ student +" Mark : ");
					numberin=scan.nextInt();
					
					if(numberin>=0 && numberin<=100) {
						isvalid=true;
					}else{
						System.out.println("Invalid Input...");
					}
				}while(!isvalid);
				     sum+=numberin;
	}
	average=(double)sum/NUM_STUDENTS;
	System.out.printf("The Average is : %2f",average);
}
}