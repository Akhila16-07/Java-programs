package Strings;

import java.util.Arrays;

public class ArrayRotation {

	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6};//2,3,4,5,6,1
		int n1=2;
		for(int j=0;j<n1;j++) {
			int first=arr[0];
			
			for(int i=0;i<arr.length-1;i++){
				
				arr[i]=arr[i+1];
			}
			arr[arr.length-1]=first;
		}

		System.out.println("Left rotation " + Arrays.toString(arr));
		int n2=3;
		 for(int i = 0; i < n2; i++){    
	            
	            //Stores the last element of array    
			 int last = arr[arr.length-1];    
	       
	            for(int j = arr.length-1; j > 0; j--){    
	                //Shift element of array by one    
	                arr[j] = arr[j-1];    
	            }    
	            //Last element of array will be added to the start of array.    
	            arr[0] = last;    
	        }   
		 System.out.println("Right rotation " + Arrays.toString(arr));
	}
}
