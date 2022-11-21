package smartgraduates;

import java.util.Scanner;

public class CircleComputation {

	public static void main(String[] args) {
		double radius,area,circumference;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		radius=scan.nextDouble();
		
		double diameter=2*radius;
		System.out.println("The Diameter of the Circle is : "+diameter);
		
		area=Math.PI*radius*radius;
		System.out.println("The Area of the Circle : "+area);
		
		circumference=2*Math.PI*radius;
		System.out.printf("The circumference of the Circle is : %2f%n" ,circumference);
		
	}

}
