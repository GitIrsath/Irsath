package smartgraduates;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class GradeStatisticsArray {
	public static int[]grades;
	
	public static void main(String[] args) {
			readgrades();
            System.out.println("The Grades are : ");
            print(grades);
            
            System.out.printf("The Average is : %.2f\n",average(grades));
            System.out.printf("The Median is : %.2f\n",median(grades));
            System.out.printf("The Maximum is : %d\n",max(grades));
            System.out.printf("The Minimum is : %d\n",min(grades));
            System.out.printf("The Standard Deviation is : %.2f",stdev(grades));
	}
	
	public static void readgrades() {
		int numberofstudents;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of Students : ");
		numberofstudents=scan.nextInt();
		
		grades=new int[numberofstudents];
		
		for(int i=0;i<grades.length;++i) {
			System.out.println("Enter the Grade of Student "+(i+1)+" : ");
			grades[i]=scan.nextInt();
		}
	}
	
	public static double stdev(int[]grades) {
		int n = grades.length;
		int sumOfSquare = 0;
		double meanSquared = Math.pow(average(grades), 2);
		double standardDeviation;

		for (int i = 0; i < n; i++) {
			sumOfSquare += grades[i] * grades[i];
		}

		standardDeviation = Math.sqrt((1.0 / n) * sumOfSquare - meanSquared);
		return standardDeviation;
	}
	
	public static double median(int[]grades) {
		Arrays.sort(grades);
		int n = grades.length;
		double median;
		if (n % 2 == 0) {
			median = (grades[(n / 2) - 1] + grades[n / 2]) / 2.0;
		} else {
			median = grades[((n + 1) / 2) - 1];
		}
		return median;
	}
	
	public static double average(int[]grades) {
		int sum=0;
		double average;
		
		for(int i=0;i<grades.length;++i) {
			sum+=grades[i];
			}
		average=(double)sum/grades.length;
		return average;
	}
	
	public static int min(int[]grades) {
		int minimum=grades[0];
		
		for(int i=0;i<grades.length;++i) {
			if(grades[i]<minimum) {
				minimum=grades[i];
			}
		}
		return minimum;
	}
	
	public static int max(int[]grades) {
		int maximum=grades[0];
		
		for(int i=0;i<grades.length;++i) {
			if(grades[i]>maximum) {
				maximum=grades[i];
			}
		}
		return maximum;
}
	public static void print(int[]grades) {
		System.out.print("[");
		for(int i=0;i<grades.length;++i) {
			if(i==0) {
				System.out.print(grades[i]);
			}
			else {
				System.out.print(", "+grades[i]);
			}
			
		}
		System.out.println("]");
	}
}