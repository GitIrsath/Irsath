package eve;

public class Abstract {
   //Abstract classes are common nonun they cannot be changed anyway...
	public static void main(String[] args) {
		BataShoe bs=new BataShoe();
		bs.Print();
	}
}
abstract class ShoeFactory{
	//The word final is used so that this method cannot be overridden in the child class...
	final public void Print() {
		System.out.println("Abstract class");
	}
}
class BataShoe extends ShoeFactory{
	//public void Print() {
		//System.out.println("Hiiii ");
	}
//}
class WalkWay extends ShoeFactory{
	
}


