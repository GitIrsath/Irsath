package smartgraduates;

import java.util.Scanner;

public class AreaOfRectangle {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the length of the rectangle");
		double length=scan.nextDouble();
		System.out.println("Enter the width of the rrectangle");
		double width=scan.nextDouble();
		double area=length*width;
		System.out.println("The Area of the Recrangle is : "+area);
		
	}

}
