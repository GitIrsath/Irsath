package smartgraduates;

public class LargestNumber {

	public static void main(String[] args) {
		double n1=6,n2=9,n3=12;
		
		if(n1>n2 && n1>n3) {
			System.out.println("n1 is the largest number");
		}
		else if(n2>n1 && n2>n3) {
			System.out.println("n2 is the largest number");
		}
		else if(n3>n1 && n3>n2) {
			System.out.println("n3 is the largest number");
		}
		else {
			System.out.println("Constants");
		}

	}

}
