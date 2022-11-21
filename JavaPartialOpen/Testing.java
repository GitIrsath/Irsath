package smartgraduates;

import java.util.Scanner;

public class Testing {

	public static void main(String[] args) {
		 String s="";
		int sl=s.length();
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		s=scan.next();
		for (int chIndex = 0; chIndex < sl; chIndex++) {
		      char ch=s.charAt(chIndex);
		}
		System.out.println(s);
	}

}
