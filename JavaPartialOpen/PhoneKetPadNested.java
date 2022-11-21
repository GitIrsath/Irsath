package smartgraduates;

import java.util.Scanner;

public class PhoneKetPadNested {

	public static void main(String[] args) {
		  String instr;
		  String keypaddigit= "";
		  
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a String : ");
		  instr=scan.next().toLowerCase();
		  
		  for(int charidx=0;charidx<instr.length();charidx++) {
			  char ch=instr.charAt(charidx);
			  if(ch=='a' || ch=='b' || ch=='c') {
				  keypaddigit+='1';
			  }
			  else if(ch=='d' || ch=='e' || ch=='f') {
				  keypaddigit+='2';
			  }
			  else if(ch=='g' || ch=='h' || ch=='i') {
				  keypaddigit+='3';
			  }
			  else if(ch=='j' || ch=='k' || ch=='l') {
				  keypaddigit+='4';
			  }
			  else if(ch=='m' || ch=='n' || ch=='o') {
				  keypaddigit+='5';
			  }
			  else if(ch=='p' || ch=='q' || ch=='r' || ch=='s') {
				  keypaddigit+='6';
			  }
			  else if(ch=='t' || ch=='u' || ch=='v') {
				  keypaddigit+='7';
			  }
			  else  if(ch=='w' || ch=='x' || ch=='y' || ch=='z') {
				  keypaddigit+='8';
			  }
			  else {
				  System.out.println("INVALID...");
			  }
		  }
		 System.out.println("The Sequence is : "+keypaddigit);  
			}

}
