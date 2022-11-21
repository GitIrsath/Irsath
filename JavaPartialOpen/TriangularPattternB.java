package smartgraduates;

import java.util.Scanner;

public class TriangularPattternB {

	public static void main(String[] args) {
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size : ");
		size=scan.nextInt();
		
		for(int row=size;row>=1; --row) {
			for(int col=1;col<=row;++col) {
				System.out.print("# ");
			}
			System.out.println();
		}


	}

}
