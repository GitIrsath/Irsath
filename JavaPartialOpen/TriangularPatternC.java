package smartgraduates;

import java.util.Scanner;

public class TriangularPatternC {

	public static void main(String[] args) {
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size : ");
		size=scan.nextInt();
		
		for(int row=1;row<=size; ++row) {
			for(int col=1;col<=size;++col) {
				if(row<=col) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
