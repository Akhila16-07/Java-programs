package singleDimensionalArray;

import java.util.Arrays;

public class MergeArray {

	public static void main(String[] args) {
		
		String a[]= {"chai","coffee"};
		String b[]= {"milk","water","coke"};
		//o/p {chai,coffee,milk,water,coke}
		int length1=a.length;
		int length2 =b.length;
		
		String [] mergedArray= new String[a.length+b.length];
		
		for(int i=0;i<length1;i++) {
			mergedArray[i]=a[i];
		}
		
		
		
		for(int i=0; i<length2;i++) {
			mergedArray[length1+i]=b[i];
		}
		
		
		//System.out.println(mergeArray);
		   System.out.println("Merged Array: " + Arrays.toString(mergedArray));
	}
}
