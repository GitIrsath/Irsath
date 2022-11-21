package smartgraduates;

import java.util.Scanner;

public class TestPalindromicWord {

	public static void main(String[] args) {
		String instr;
		boolean isplaindrome=false;
		int fidx=0;
		
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		instr=scan.next();
		
		int bidx=instr.length()-1;
		
		while(fidx<bidx) {
			if(instr.charAt(fidx)==instr.charAt(bidx)) {
				isplaindrome=true;
			}
			fidx++;
			bidx--;
			
		}
		if(isplaindrome) {
			System.out.println(instr+ " is a Palindrome...");
		}
		else {
			System.out.println(instr+ " is not a Palindrome");
		}

	}

}
