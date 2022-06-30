package eve;

public class Interface4 {
       public static void main(String[] args) {
		 //Method Referencing
    	   
	func2 fc2=Interface4::mymet;
	fc2.met();
	
    //func1 fc1=Interface4::mymet;	   
	func1 fc1=new Interface4()::mymet2;
	fc1.met("He...");
}
   static void mymet() {
	   System.out.println("Hi....");
   }
   void mymet2(String s) {
	   System.out.println("Hello....");
   }
 }
interface func1{
	public void met(String s); 
}
interface func2{
	public void met();
}