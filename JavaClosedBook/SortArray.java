package closedbook;

public class SortArray {

	public static void main(String[] args) {
		int[] array= {1,23,45,21,2};
		
		System.out.println("Before sorting...");
		printarray(array);
		
		sortarray(array);
		
		System.out.println("After sorting...");
		printarray(array);

	}
	public static void sortarray(int[]array) {
		int temp;
		int swap=0;
		
		for(int i=0;i<array.length;++i) {
			swap=0;
			for(int j=0;j<array.length-1;++j) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
					++swap;
				}
			}
			if(swap==0) {
				break;
			}
			
		}
		
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
