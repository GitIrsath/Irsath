package closedbook;

import java.util.Scanner;

public class ResizeArray {

	public static void main(String[] args) {
			int [] array=new int[5];
			int newsize;
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the size of the Array : ");
			newsize=scan.nextInt();
			
			array=resize(array,newsize);
			
			System.out.println("The resize array is : "+array.length);
			scan.close();
			
	
	}
	public static int[] resize(int[]array,int newsize) {
		int[]copy=new int[newsize];
		
		if(copy.length>newsize) {
			for(int i=0;i<newsize;++i) {
				copy[i]=array[i];
			}
		}
			else {
				for(int i=0;i<array.length;++i) {
					copy[i]=array[i];
				}
			}
				return copy;
	}
}


