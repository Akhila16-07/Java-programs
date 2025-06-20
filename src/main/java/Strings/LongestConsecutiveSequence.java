package Strings;

	import java.util.Arrays;

	public class LongestConsecutiveSequence {
		
		
		   public static void main(String[] args) {
			   int arr[] = {4, 25, 6, 3, 2, 3, 4, 10};
			   System.out.println(findLongestConsecutive(arr));
		       
		   }
		
	    public static int findLongestConsecutive(int[] arr) {
	        if (arr.length == 0) 
	        	return 0;
	        
	        Arrays.sort(arr); // Step 1: Sort the array
	        int longest = 1, currentStreak = 1;
	       // {2,3,3,4,4,6,10,11,12,13,25}
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] == arr[i - 1]) continue; // Skip duplicates
	            if (arr[i] == arr[i - 1] + 1) {
	                currentStreak++; // Increase streak if consecutive
	            } else {
	                longest = Math.max(longest, currentStreak); // Update longest
	                currentStreak = 1; // Reset streak
	            }
	        }
	        return Math.max(longest, currentStreak); // Return the max sequence found
	    }

	 
	}

