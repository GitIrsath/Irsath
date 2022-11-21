package smartgraduates;

import java.util.Scanner;

public class IncomeTaxCalculator {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Income : ");
		int taxableIncome=scan.nextInt();
		
		final double INCOME_TAX_ABOVE_20K=0.1;
		final double INCOME_TAX_ABOVE_40K=0.2;
		final double INCOME_TAX_ABOVE_60K=0.3;
		
		double taxpayable;
		
		
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
		System.out.println("The Income Tax Payable is : "+taxpayable +" Rupees");
		
		
	}

}
