package smartgraduates;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		double radius=scan.nextDouble();
		
		double area=Math.PI * radius * radius;
		System.out.println("The Area is : "+area);
		double circumference=2 * Math.PI * radius;
		
		System.out.println("The Cicumference is : "+circumference);
	}

}
