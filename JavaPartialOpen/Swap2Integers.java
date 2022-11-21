package smartgraduates;

public class Swap2Integers {

	public static void main(String[] args) {
		float num1=4.5f;
		float num2=2.6f;
		
		System.out.println("Before Swapping");
		System.out.println("First Number is : "+num1);
		System.out.println("Second number is : "+num2);
		
		float temporary=num1;
		num1=num2;
		num2=temporary;
		
		System.out.println("After Swapping");
		System.out.println("First Number is : "+num1);
		System.out.println("Second number is : "+num2);
				
				

	}

}
