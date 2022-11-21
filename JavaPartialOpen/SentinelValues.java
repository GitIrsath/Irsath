package smartgraduates;

import java.util.Scanner;

public class SentinelValues {

	public static void main(String[] args) {
			final int sentinel=-1;
			
			int taxableIncome;
			double taxpayable;
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the Taxable income (OR -1) : ");
			taxableIncome=scan.nextInt();
			
			while(taxableIncome!=sentinel) {
				if (taxableIncome>60000) {
					taxpayable=20000*(30.0f/100.0f);
					
				}
				 if(taxableIncome>40000) {
					taxpayable=20000*(20.0f/100.0f);
					
					
				}
				else if(taxableIncome>20000) {
					taxpayable=20000*(10.0f/100.0f);
								
				}else {
					taxpayable=20000*(0.0f/100.0f);
				}
				 System.out.println("Income Tax Payable is : "+taxpayable);
			
				 System.out.println("Enter the Taxable income (OR -1) : ");
				 taxableIncome=scan.nextInt();
			}
			System.out.println("<<<BYE>>>");
			
	}

}
