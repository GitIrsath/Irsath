package smartgraduates;

import java.util.Scanner;

public class PrintArray {

	public static void main(String[] args) {
		 final int NUM_ITEMS;
		 int items[];
		 
		 Scanner scan=new Scanner(System.in);
		 System.out.print("Enter the number of items : ");
		 NUM_ITEMS=scan.nextInt();
		 
		 items=new int[NUM_ITEMS];
		 
		 if(items.length>0) {
			 System.out.print("Enter the values of all items (Separated by spaces) : ");
			 
			 for(int i=0;i<items.length;i++) {
				 items[i]=scan.nextInt();
			 }
		 }
		 System.out.print("The values are : [");
		 for(int i=0;i<items.length;i++) {
			 if(i==0) {
				 System.out.print(items[i]);
			 }
			 else {
				 System.out.print(", "+items[i]);
			 }
		 }
		 System.out.print("]");
	}

}
