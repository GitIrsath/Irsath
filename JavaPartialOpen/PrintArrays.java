package smartgraduates;

public class PrintArrays {

	public static void main(String[] args) {
			int[]intarray= {10,20,30,40,50};
			float[]floatarray= {2.3f,4.3f,60.4f,12.3f};
			double[]doublearray= {3.123,67.432,98.54,100.34,64.223,8.765};
			
			print(intarray);
			print(floatarray);
			print(doublearray);
	
     }
	
	public static void print(int[]array) {
		System.out.print("[");
		for(int i=0;i<array.length;++i) {
			if(i==0) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(" , " +array[i]);
			}
			
		}
		System.out.println("]");
		
	}
	
	public static void print(float[]array) {
		System.out.print("[");
		for(int i=0;i<array.length;++i) {
			if(i==0) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(" , " +array[i]);
			}
			
		}
		System.out.println("]");
		
	}
	
	public static void print(double[]array) {
		System.out.print("[");
		for(int i=0;i<array.length;++i) {
			if(i==0) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(" , " +array[i]);
			}
			
		}
		System.out.print("]");
		
	}
}