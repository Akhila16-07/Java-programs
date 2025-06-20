package Strings;

public class DuplicateCharsInArrays {

	public static void main(String[] args) {
		//2. Write a program to print the duplicate characters in two arrays
		String[] array1={"t","y","h","j","k","h"};
				
		String[] array2={"h","i","t","o","p","t"};
		//output=t,h
		String str="";
		for(int i=0;i<array1.length;i++) {
		
			for(int j=0;j<array2.length;j++) {
				if(array1[i].equals(array2[j]) && !str.contains(array1[i])) {
					str=str+array1[i];
					System.out.println(array1[i]);
				}
				
			}
		}
		
	}
}
