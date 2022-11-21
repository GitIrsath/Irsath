package smartgraduates;

import java.util.Scanner;

public class CaesarCode {

	public static void main(String[] args) {
		String instr="";
		String cipheredtext="";
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the PlainText Code : ");
		instr=scan.next().toUpperCase();
		
		for(int charidx=0;charidx<instr.length();charidx++) {
			char ch=instr.charAt(charidx);
			ch=(char)(ch+3);
			cipheredtext+=ch;
		}
		System.out.println("The Ciphered Text is : "+cipheredtext);

	}

}
