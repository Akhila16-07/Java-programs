package multiDimensionalArray;

public class AddToTwoDimensionalArray {

	public static void main(String[] args) {
		
		int [][] arr1 = {
				{1,2,4},
				{3,4,5},
				{5,6,7}
			};
		
		int [][] arr2 = {
				{1,2,2},
				{3,4,2},
				{5,6,1}
			};
		
		int [][] arr3 = new int[3][3];
		
		for(int i =0; i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
			 arr3[i][j]= arr1[i][j] +arr2[i][j];
			System.out.print(arr3[i][j] +" ");
			}
			System.out.println();
		}
	}
}
