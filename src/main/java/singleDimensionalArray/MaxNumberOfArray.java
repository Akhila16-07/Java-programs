package singleDimensionalArray;

public class MaxNumberOfArray {

	public static void main(String[] args) {
		
		int[] arr= {3,5,6,9,3,7};
		
		int maxIndex = 0;
		int max= arr[0];
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>max) {
				max=arr[i];
				maxIndex=i;
			}

		}
		System.out.println(maxIndex);
		System.out.println(max);
	}
	
}
