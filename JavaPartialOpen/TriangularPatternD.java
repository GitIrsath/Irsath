package smartgraduates;

import java.util.Scanner;

public class TriangularPatternD {

	public static void main(String[] args) {
		int size;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size : ");
		size=scan.nextInt();
		
		for(int row=1;row<=size; ++row) {
			for(int col=size;col>=1;--col) {
				if(row>=col) {
					System.out.print("# ");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
