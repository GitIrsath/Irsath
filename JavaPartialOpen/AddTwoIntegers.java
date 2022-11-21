package smartgraduates;

import java.util.Scanner;

public class AddTwoIntegers {

	public static void main(String[] args) {
		int firstnumber,secondnumber,sum;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Integer");
		 firstnumber=scan.nextInt();
		 
	    System.out.println("Enter the Second Integer");
		 secondnumber=scan.nextInt();
		
		 scan.close();
        sum=firstnumber+secondnumber;
        System.out.println("The sum of two numbers is : "+sum);
	}

}
