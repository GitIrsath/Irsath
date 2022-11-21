package smartgraduates;

import java.util.Scanner;

public class Hex2Bin {

	public static void main(String[] args) {
		final String[] HEX_BITS= {
				"0000", "0001", "0010", "0011",
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				 "1100", "1101", "1110", "1111"	
		};
		
		String instr,resultbin="";
		int instrlen;
		char inchar;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a HexaDecimal String : ");
		instr=scan.next();
		instrlen=instr.length();
		
		for(int chidx=0;chidx<instrlen;++chidx) {
			inchar=instr.toUpperCase().charAt(chidx);
			
			if(inchar>='A' && inchar<='F') {
				resultbin+=HEX_BITS[inchar-55];
			}
			else {
				resultbin+=HEX_BITS[Character.getNumericValue(inchar)];
			}
			resultbin+=" ";
		}
			System.out.println("The Equivalent binary is : "+resultbin);
	}

}
