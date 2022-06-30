package eve;

public class Abstract3 {
	//Abstraction is a process of hiding the internal and showing only the needed...
   public static void main(String[] args) {
	Dominos irsathdominos=new irsathdominos();
	irsathdominos.sellpizza();
}
}
abstract class Dominos{
	private void makedough() {
		System.out.println("Dough maked as per Dominos order...");
	}
	private void addingredients() {
		System.out.println("Ingredients added as per Dominos order...");
	}
	private void bakepizza() {
		System.out.println("pizza baked as per Dominos order...");
	}
	private void makepizza() {
		 makedough();
		 addingredients();
		 bakepizza();
	}
	abstract public void acceptmoney(); 
	abstract public void deliverpizza();
		
	 public void sellpizza() {
		 acceptmoney(); 
		 makepizza();
		 deliverpizza();
	}
}
class irsathdominos extends Dominos{
	@Override
	public void acceptmoney() {
		System.out.println("money is accepted in rupees...");
	}
	@Override
	public void deliverpizza() {
		System.out.println("pizza is delivered in bike...");
	}
}
