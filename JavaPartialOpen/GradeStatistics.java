package smartgraduates;

import java.util.Scanner;

public class GradeStatistics {

	public static void main(String[] args) {
		final int NUM_STUDENTS;
		int[]grades;
		double average;
		int sum=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of Students : ");
		NUM_STUDENTS=scan.nextInt();
		
		grades=new int[NUM_STUDENTS];
		
		for(int studentno=0;studentno<grades.length;studentno++) {
			System.out.println("Enter the Grade for Student "+(studentno+1)+ ": ");
			grades[studentno]=scan.nextInt();
		}
		
		int min=grades[0];
		int max=grades[0];
		
		for(int i=0;i<grades.length;i++) {
			if(grades[i]<min) {
				min=grades[i];
			}
			if(grades[i]>max) {
				max=grades[i];
			}
			sum+=grades[i];
		}
		average=(double)sum/grades.length;
		
		System.out.printf("The average is : %.2f\n",average);
		System.out.printf("The minimum is : %d\n",min);
		System.out.printf("The maximum is : %d",max);
	}

}
