package smartgraduates;

import java.util.Scanner;

public class AverageWithInputValidation {

	public static void main(String[] args) {
			final int MIN_STUDENTS=3;
			
			int numberIn;
			boolean isvalid;
			int sum=0;
			double average;
			
			Scanner scan=new Scanner(System.in);
			
			for(int studentNo=1;studentNo<=MIN_STUDENTS;++studentNo) {
				isvalid=false;
			do {
			  System.out.println("Enter Mark (0-100) for Student "+studentNo );	
			  numberIn=scan.nextInt();
			  
			if(numberIn>=0 && numberIn<=100) {
				isvalid=true;
			}
			else {
			    System.out.println("Invalid Input !!!");
			}
			
		}while(!isvalid);
			sum+=numberIn;
		}
			average=sum/MIN_STUDENTS;
			System.out.printf("The Average is : %.2f",average);
	}
}
