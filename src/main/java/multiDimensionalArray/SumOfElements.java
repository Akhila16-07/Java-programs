package multiDimensionalArray;

public class SumOfElements {
	public static void main(String[] args) {
		
		int[][] arr= new int[3][4];
		
		arr[0][0]=1;
		arr[0][1]=2;
		arr[0][2]=3;
		arr[0][3]=4;
		
		arr[1][0]=2;
		arr[1][1]=3;
		arr[1][2]=5;
		arr[1][3]=4;
		
		arr[2][0]=5;
		arr[2][1]=3;
		arr[2][2]=4;
		arr[2][3]=4;
		
		int sum=0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				sum=sum+arr[i][j];
			}
		}
		System.out.println(sum);
	}

}
