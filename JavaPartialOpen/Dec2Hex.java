package smartgraduates;

import java.util.Scanner;

public class Dec2Hex {

	public static void main(String[] args) {
		int decimalinput;
		String resulthex="";
		int remainder;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Decimal Number : ");
		decimalinput=scan.nextInt();
		
		while(decimalinput!=0) {
			remainder=decimalinput%16;
			
			if(remainder>=10) {
				resulthex=(char)(remainder+55)+resulthex;
			}
			else {
				resulthex=remainder+resulthex;
			}
			
			decimalinput/=16;
		}
			System.out.println("The HexaDecimal number is : "+resulthex);
	}

}
