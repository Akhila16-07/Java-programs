package multiDimensionalArray;

public class InterchangingColAndRowValues {

	public static void main(String[] args) {
		

		int[][] arr1= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//System.out.println(arr1.length);
		int[][] arr2=new int[3][3];
	for(int i=0;i<arr1.length;i++) {
		//System.out.println(arr1[2].length);
		for(int j= 0;j<arr1[i].length;j++) {
			arr2[i][j]=arr1[j][i];
			System.out.print(arr2[i][j]+ " ");
		}
		System.out.println();
	}
		
		
	}
}
