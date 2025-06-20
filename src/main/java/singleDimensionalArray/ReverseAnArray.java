package singleDimensionalArray;

public class ReverseAnArray {

	public static void main(String[] args) {
		
		String[] arr = {"true","false","true","false"};
		
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i] + " ");
		}
	}
}
