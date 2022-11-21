package smartgraduates;

public class CopyArray {

	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4, 5};

		printarray(array);
		printarray(copyof(array));
		printarray(copyof(array,3));
		printarray(copyof(array,11));

	}
	
	public static int[] copyof(int[]array) {
		int[]copy = new int[array.length];
		
		for(int i=0;i<array.length;++i) {
			copy[i]=array[i];
		}
		
		return copy;
	}
	
	public static int[] copyof(int []array,int size) {
		int[]copy=new int[size];
		
		if(array.length>size) {
			for(int i=0;i<size;++i) {
				copy[i]=array[i]; 
			}
		}
		else {
				for(int i=0;i<array.length;++i) {
					copy[i]=array[i];
				}
			}
			
		return copy;
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
