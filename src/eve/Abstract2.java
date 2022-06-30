package eve;

public class Abstract2 {
     public static void main(String[] args) {
		irsath irs=new irsath();
		irs.eat();
		irs.speak();
	}
}
abstract class Human{
	abstract void speak();
	public void eat() {
		System.out.println("I can eat...");
	}
}
class irsath extends Human{
	//This is how we can access the abstract methods...
	public void speak() {
		System.out.println("I can speak...");
	}
}