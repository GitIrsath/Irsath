package eve;

public class Interface2 {
	public static void main(String[] args) {
		/*   Inplementations are in four ways
		 *1.Anonymous
		 *2.Inner/Outer
		 *3.Lambda
		 *4.Method Referencing 
		 */
		
		//Anonymous one type
		Funcinter fc=new Funcinter() {
 			@Override
			public void met() {
				System.out.println("met called");	
			}
		};
		fc.met();
		//Anonymous another type
		new Funcinter() {
			
			@Override
			public void met() {
				System.out.println("met 2 called");			
			}
		}.met();
		
		
		
		//Anonnymous type for return types
		//1.return type
		Funcinter2 fc2=new Funcinter2() {
		    @Override
			public String met2() {
		    	return "10";
			}
		};
		String s=fc2.met2();
		System.out.println(s);
		//2.return type
	    s=new Funcinter2() {
			@Override
			public String met2() {
				return "20";		
			}
		}.met2();
		System.out.println(s);
	}
     
}
interface Funcinter{
	public void met();
}
interface Funcinter2{
	public String met2();
}
   
    
