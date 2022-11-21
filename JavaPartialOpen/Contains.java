package smartgraduates;

public class Contains {

	public static void main(String[] args) {
		int[]array= {10,20,30,40,50};
		int key=1;
		
	if(contains(array,key)) {
		System.out.println("The Array Contains : "+key);
	}
	else {
		System.out.println("The Array does not contain "+key);
	}
}
	public static boolean contains(int[]array,int key) {
		for(int i=0;i<array.length;++i) {
			if(array[i]==key) {
				return true;
			}
		}
		
		return false;
	}
}
