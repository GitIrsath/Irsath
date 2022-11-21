package smartgraduates;

import java.util.Scanner;

public class PhoneKeyPadSwitch {

	public static void main(String[] args) {
		 String instr;
		  String keypaddigit= "";
		  
		  Scanner scan=new Scanner(System.in);
		  System.out.println("Enter a String : ");
		  instr=scan.next().toLowerCase();
		  
		  for(int charidx=0;charidx<instr.length();charidx++) {
			  char ch=instr.charAt(charidx);
			  
			  switch(ch) {
			  	case 'a':case'b':case'c':
			  		keypaddigit+='2';
			  		break;
			  	case 'd':case'e':case'f':
			  		keypaddigit+='3';
			  		break;
			  	case 'g':case'h':case'i':
			  		keypaddigit+='4';
			  		break;
			  	case 'j':case'k':case'l':
			  		keypaddigit+='5';
			  		break;
			  	case 'm':case'n':case'o':
			  		keypaddigit+='6';
			  		break;
			  	case 'p':case'q':case'r':case's':
			  		keypaddigit+='7';
			  		break;
			  	case 't':case'u':case'v':
			  		keypaddigit+='8';
			  		break;
			  	case 'w':case'x':case'y':case'z':
			  		keypaddigit+='9';
			  		break;
			  	default:
			  		keypaddigit+='0';
			  		
			  }
	}
		  System.out.println("The Sequence is : "+keypaddigit);
	}
}
