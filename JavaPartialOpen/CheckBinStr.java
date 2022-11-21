package smartgraduates;

import java.util.Scanner;

public class CheckBinStr {

	public static void main(String[] args) {
		String instr;
		int strlen;
		char inchar;
		boolean isvalid=true;
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a String : ");
		instr=scan.next();
		
		strlen=instr.length();
		for(int charidx=0;charidx<strlen;charidx++) {
			inchar=instr.charAt(charidx);
			
			if(!(inchar=='0'||inchar=='1')) {
				isvalid=false;
				break;
			}
			}
			if(isvalid) {
				System.out.println(instr+" is a binary String");
				
			}else {
				System.out.println(instr+" is not a binary String");
			}
		}

	}

