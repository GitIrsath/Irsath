package closedbook;

public class TypeCasting {

	public static void main(String[] args) {
		 byte bytevar=10;
		 bytevar=20;
		 
		 short shortvar=1111;
		 shortvar=2222;
		 
		 int intvar=100000;
		 intvar=200000;
		 
		 long longvar=100000000000L;
		 longvar=2000000000L;
		 
		 String str="Hi How are you ?";
		 str="I Love Programming...";
		 
		 float flovar=12.34f;
		 flovar=1.234f;
		 
		 double doublevar=1.234566;
		 doublevar=2.1234567;
		 
		 char ch='A';
		 ch='b';
		 
		 boolean bool=true;
		 bool=false;
		 
		 intvar=bytevar;
		 bytevar=(byte)intvar;
		 
		 flovar=intvar;
		 intvar=(int)flovar;
		 
		 ch=(char)intvar;
		 intvar=ch;
		 
		 System.out.println("Default value for byte is : "+bytevar);
		 System.out.println("Default value for short is : "+shortvar);
		 System.out.println("Default value for int is : "+intvar);
		 System.out.println("Default value for long is : "+longvar);
		 System.out.println("Default value for float is : "+flovar);
		 System.out.println("Default value for double is : "+doublevar);
		 System.out.println("Default value for char is : "+ch);
		 System.out.println("Default value for boolean is : "+bool);
		 System.out.println("Default value for String is : "+str);

	}

	}
