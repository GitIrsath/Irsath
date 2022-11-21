package smartgraduates;

import java.util.Scanner;

public class OddEvenTest {

	public static void main(String[] args) {
		int number;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number : ");
		number=scan.nextInt();
		
		if(isodd(number)) {
			System.out.println(number+" is a odd number");
		}
		else {
			System.out.println(number+" is a even number");
		}
	}
	public static boolean isodd(int num) {
		if(num%2==0) {
			return false;
		}
		return true;
	}

}
