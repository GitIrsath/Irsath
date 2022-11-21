package smartgraduates;

import java.util.Scanner;

public class CountVowelDigits {

	public static void main(String[] args) {
		String instr;
		int instrlen,digits=0,vowels=0;
		double digitspercent,vowelspercent;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		instr=scan.next().toLowerCase();
		instrlen=instr.length();
		
		for(int charidx=0;charidx<instrlen;++charidx) {
			char ch=instr.charAt(charidx);
			if(Character.isDigit(ch)) {
				++digits;
			}
			else if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				++vowels;
			}
			}
		
		digitspercent=(((double)digits/instrlen)*100);
		vowelspercent=(((double)vowels/instrlen)*100);
		
		System.out.printf("Number of digits is : %d (%.2f)\n",digits,digitspercent);
		System.out.printf("Number of Vowels : %d (%.2f)",vowels,vowelspercent);
	}

}
