package smartgraduates;

import java.util.Scanner;

public class SumProductMinMax5 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the First Number : ");
		int number1=scan.nextInt();
		
		System.out.println("Enter the Second Number : ");
		int number2=scan.nextInt();
		
		System.out.println("Enter the Third Number : ");
		int number3=scan.nextInt();
		
		System.out.println("Enter the Fourth Number : ");
		int number4=scan.nextInt();
		
		System.out.println("Enter the Fifth Number : ");
		int number5=scan.nextInt();
		
		scan.close();
		
		int sum=number1+number2+number3+number4+number5;
		System.out.println("The sum of the numbers is : "+sum);
		
		int product=number1*number2*number3*number4*number5;
		System.out.println("The product of the numbers is : "+product);
		
		if(number1<number2 && number1<number3 && number1<number4 && number1<number5) {
			System.out.println(number1+" is the smallest number");
		}
		
		if(number2<number1 && number2<number3 && number2<number4 && number2<number5) {
			System.out.println(number2+" is the smallest number");
		}
		
		if(number3<number1 && number3<number2 && number3<number4 && number3<number5) {
			System.out.println(number3+" is the smallest number");
		}
		
		if(number4<number1 && number4<number2 && number4<number3 && number4<number5) {
			System.out.println(number4+" is the smallest number");
		}
		
		if(number5<number1 && number5<number2 && number5<number3 && number5<number4) {
			System.out.println(number5+" is the smallest number");
		}
		
		if(number1>number2 && number1>number3 && number1>number4 && number1>number5) {
			System.out.println(number1+" is the greatest number");
		}
		
		if(number2>number1 && number2>number3 && number2>number4 && number2>number5) {
			System.out.println(number2+" is the greatest number");
		}
		
		if(number3>number1 && number3>number2 && number3>number4 && number3>number5) {
			System.out.println(number3+" is the greatest number");
		}
		
		if(number4>number1 && number4>number2 && number4>number3 && number4>number5) {
			System.out.println(number4+" is the greatest number");
		}
		
		if(number5>number1 && number5>number2 && number5>number3 && number5>number4) {
			System.out.println(number5+" is the greatest number");
		}
		
		
	}

}
