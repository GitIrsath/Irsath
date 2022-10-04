package smartgraduates;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		float first=2.5f,second=4.5f;
				
		System.out.println("Before Swapping");
        System.out.println("First Number is : " +first);
        System.out.println("Second Number is : " +second);
	   
        float temporary=first;
        first=second;
        second=temporary;
        
        System.out.println("After Swapping");
        System.out.println("First Number is : " +first);
        System.out.println("Second Number is : " +second);
	
	
	}
}