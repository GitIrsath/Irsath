package smartgraduates;

import java.util.Scanner;

public class GradesHistogram {
	public static int[]grades;
	public static void main(String[] args) {
		readgrades();
        System.out.println("The Grades are : ");
        print(grades);
        
        verticalHistogram(grades);
        System.err.println();
        horizontalHistogram(grades);
	}
	
	public static int[] calculatehistogram(int[]array) {
		int[]histogramdata=new int[10];
		int currentdata;
		
		for(int i=0;i<array.length;++i) {
			currentdata=array[i]/10;
			
			if(currentdata<9) {
				histogramdata[currentdata]++;
			}
			else {
				histogramdata[9]++;
			}
		}
		return histogramdata;
	
	}
	
	public static void verticalHistogram(int[] array) {
		int[] data = calculatehistogram(grades);
		int upperbound, lowerbound;
		for (int i = 0; i < data.length; i++) {
			lowerbound = i * 10;
			upperbound = (i == data.length - 1)? (i * 10 + 10) : (i * 10 + 10) - 1;

			System.out.printf("%3d - %3d: ", lowerbound, upperbound);
			for (int star = 1; star <= data[i]; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void horizontalHistogram(int[] array) {
		int[] data = calculatehistogram(array);
		int maxData = max(data);
		int lowerbound, upperbound;

		for (int i = maxData; i >= 1; i--) {
			for (int j = 0; j < data.length; j++) {
				if (i == data[j]) {
					System.out.printf("%4c  ", '*');
					--data[j];
				} else {
					System.out.printf("%4c  ", ' ');
				}
			}
			System.out.println();
		}
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
		public static int max(int[]grades) {
			int maximum=grades[0];
			
			for(int i=0;i<grades.length;++i) {
				if(grades[i]>maximum) {
					maximum=grades[i];
				}
			}
			return maximum;
		}
		
}