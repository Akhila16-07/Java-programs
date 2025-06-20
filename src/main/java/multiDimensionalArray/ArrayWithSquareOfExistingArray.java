package multiDimensionalArray;

public class ArrayWithSquareOfExistingArray {

	public static void main(String[] args) {
		

		int [][] arr1 = {
				{1,2,4},
				{3,4,5},
				{5,6,7}
			};
		
		int[][] arr2= new int [3][3];
		for(int i=0;i<arr1.length;i++) {
			for(int j=0 ; j<arr1[i].length;j++) {
				arr2[i][j]=arr1[i][j]* arr1[i][j];
			System.out.print(arr2[i][j] +" ");
		}
			System.out.println();
		}
	}
}
