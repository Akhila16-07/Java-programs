package Strings;

import java.util.Arrays;
import java.util.Comparator;

public class Sorting_array_of_string_based_onthelength_of_string {

	public static void main(String[] args) {
		String[] arr = {"apple", "banana", "kiwi", "grape", "orange", "fig"};

        // Sorting based on string length
        //Arrays.sort(arr, Comparator.comparingInt(String::length));

        // Printing the sorted array
        System.out.println(Arrays.toString(arr));
	}
}
