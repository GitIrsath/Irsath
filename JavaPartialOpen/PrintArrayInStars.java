package smartgraduates;

import java.util.Scanner;

public class PrintArrayInStars {

	public static void main(String[] args) {
		final int NUM_ITEMS;
		int[]items;
		
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the number of items : ");
		NUM_ITEMS=scan.nextInt();
		
		items=new int[NUM_ITEMS];
		
		if(items.length>0) {
			System.out.print("Enter the values of all items (separated by spaces) : ");
			
			for(int i=0;i<items.length;i++) {
				items[i]=scan.nextInt();
			}
		}
		
		for(int idx=0;idx<items.length;++idx) {
			System.out.print(idx+" : ");
			for(int starno=0;starno<items[idx];++starno) {
				System.out.print("*");
			}
			System.out.println("(" +items[idx]+ ")");
		}

	}

}
