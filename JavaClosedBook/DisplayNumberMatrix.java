package closedbook;

public class DisplayNumberMatrix {

	public static void main(String[] args) {
		int[][]array= {
				{1,2,3,4},
				{5,6,7,8},
				{9, 10, 11, 12},
				{13,14,15,16}
		};
		
		printmatrix(array);

	}
	public static void printmatrix(int[][]array){
		for(int row=0;row<array.length;++row) {
			for(int col=0;col<array[0].length;++col) {
				System.out.print(array[row][col]);
			}
			System.out.println();
		}
	}

}
