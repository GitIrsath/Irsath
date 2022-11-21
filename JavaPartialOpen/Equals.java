package smartgraduates;

public class Equals {

	public static void main(String[] args) {
		int[]array1= {1,2,3,4,5};
		int[]array2= {1,2,3,4,5};
	
		if(equal(array1,array2)) {
			System.out.println("The arrays are equal");
		}
		else {
			System.out.println("The arrays are not equal");
		}
	}
	
	public static boolean equal(int[]array1,int[] array2) {
		if(array1.length==array2.length) {
			for(int i=0;i<array1.length;++i) {
				if(array1[i]!=array2[i]) {
					return false;
				}
			}
			return true;
		}
		
		return false;
	}

}
