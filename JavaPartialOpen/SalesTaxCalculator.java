package smartgraduates;

import java.util.Scanner;

public class SalesTaxCalculator {

	public static void main(String[] args) {
			
		    final double SALES_TAX_RATE = 0.07;
			final int SENTINEL = -1;
			double price,actualprice,salestax;
			double totalprice=0.0,totalactualprice=0.0,totalsaletax=0.0;
			
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the tax-inclusive price in dollars : ");
			price=scan.nextDouble();
			
	
				
			while(price!=SENTINEL) {
				actualprice=price/(1+SALES_TAX_RATE);
				salestax=price-actualprice;
				
				totalprice+=price;
				totalactualprice+=actualprice;
				totalsaletax+=salestax;
				
				System.out.printf("Actual Price is : %.2f , Sales Tax is : %.2f\n\n",actualprice,salestax);
				
				System.out.println("Enter the tax-inclusive price in dollars : ");
				price=scan.nextDouble();
			}
			System.out.printf("Total price is : %.2f\n",totalprice);
			System.out.printf("Total actual price is : %.2f\n",totalactualprice);
			System.out.printf("Total sales tax is : %.2f",totalsaletax);

	}

}
