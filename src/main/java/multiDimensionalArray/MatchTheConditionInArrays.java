package multiDimensionalArray;

public class MatchTheConditionInArrays {
//if same element in two arrays print 1 if not print 0
	public static void main(String[] args) {
	
		int[][] arr1= {
				{1,2,1},
				{2,2,1},
				{3,4,1}
		};
		
		int[][] arr2= {
				{2,1,2},
				{1,1,1},
				{3,1,1}
		};
		int[][]arr3= new int[3][3];
		for(int i =0 ;i<arr1.length;i++) {
			for(int j=0;j<arr1[i].length;j++) {
				if(arr1[i][j]==arr2[i][j]) {
					arr3[i][j]=1;
				}else {
					arr3[i][j]=0;
				}
				System.out.print(arr3[i][j] + " ");
			}
			System.out.println();
		}
	}

}
