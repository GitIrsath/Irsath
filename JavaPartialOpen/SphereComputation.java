package smartgraduates;

import java.util.Scanner;

public class SphereComputation {

	public static void main(String[] args) {
		double radius,volume,SurfaceArea;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		radius=scan.nextDouble();
		
		SurfaceArea=4*Math.PI*radius*radius;
		System.out.println("The Surface Area of the Sphere is : "+SurfaceArea);
		
		volume= 4 /3 * Math.PI * radius * radius * radius;
		System.out.println("The Volume of the Sphere is : "+volume);
	}

}
