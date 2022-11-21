package smartgraduates;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String instr;
		int instrlen;
		String reversestr="";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		instr=scan.next();
		instrlen=instr.length();
		
		for(int charidx = instrlen-1;charidx>=0;--charidx) {
			reversestr+=instr.charAt(charidx);
		}
		System.out.println("The reverse is : "+reversestr);
		}

}
