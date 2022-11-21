package closedbook;

public class ReverseArray {

	public static void main(String[] args) {
int[] array= {1,23,45,21,2};
		
		System.out.println("Before reverse...");
		printarray(array);
		
		reverse(array);
		
		System.out.println("After reverse...");
		printarray(array);


	}
	public static void reverse(int[]array) {
		int temp,fidx=0,bidx;
		
		for(bidx=array.length-1;fidx<bidx;++fidx,--bidx) {
			temp=array[fidx];
			array[fidx]=array[bidx];
			array[bidx]=temp;
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
