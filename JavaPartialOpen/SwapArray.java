package smartgraduates;

public class SwapArray {

	public static void main(String[] args) {
		int[] array1= {1,2,3,4,5};
		int[]array2= {1,2,3,4,5};
		
		printarray(array1);
		printarray(array2);
		
		if(swap(array1,array2)) {
			System.out.println("Arrays are Swapped Successfully...");
		}
		else {
			System.out.println("Arrays are not Swapped...");
		}

	}
	
	public static boolean swap(int[]array1,int[]array2) {
		if(array1.length!=array2.length) {
				return false;
		}
		
		int temp;
		for(int i=0;i<array1.length;++i) {
			temp=array1[i];
			array1[i]=array2[i];
			array2[i]=temp;
		}
		return true;
		
		
	}
	public static void printarray(int[]array) {
		System.out.print("The values are : [");
		for(int i=0;i<array.length;++i) {
			if(i==0) {
				System.out.print(array[i]);
			}
			else {
				System.out.print(", "+array[i]);
			}
			
		}
		System.out.println("]");
	}

}
