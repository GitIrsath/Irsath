package eve;
     //Lambda and method referencing works only on the functional interface
	 // Anonymous interface can be used in any interface
     //Note that whenever we get interfaces use Lambdas and method referencing
public class Interface3 {
	public static void main(String[] args) {
	//Lambda interface
	//non returnable type	
	Funcinter3 fc3=()->{System.out.println("met called......");};
	fc3.met();
	
	//returnable type
	Funcinter4 fc4=()->{return "met 2 called....";};
	System.out.println(fc4.met2());
	
	//passing parameters with returnable type
	 Funcinter5 fc5=(s,age)->{System.out.println(s);return age;};
	 System.out.println(fc5.met3("Rs",18));
	 
	 //complex type
	 Funcinter7 fc7=(e,s,age)->{System.out.println(e+":"+s+":"+age);return new Employee();};
	 System.out.println(fc7.met5(new Employee(),"dadada",19));
}
	}
interface Funcinter3{
	public void met();
}
interface Funcinter4{
	public String met2();
	
}
interface Funcinter5{
	public int met3(String s,int age);
}
interface Funcinter6{
	public int met4(String s,int age);
}
interface Funcinter7{
	public Employee met5(Employee e,String s,int age);
}
class Employee{}