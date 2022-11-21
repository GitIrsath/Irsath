package smartgraduates;

public class Search {

	public static void main(String[] args) {
		int[]array= {12,23,45,0,21,1};
		int key=0;
		
		int result=search(array,key);
		
		if(result==-1) {
			System.out.println("The array does not contain "+key);
		}
		else {
			System.out.println(key+" is found at the index "+result);
		}
	}
	
	public static int search(int[]array,int key) {
		for(int i=0;i<array.length;++i) {
			if(array[i]==key) {
			return i;
		}
	}
		return -1;
	}

}
