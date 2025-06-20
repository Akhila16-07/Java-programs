package Strings;

import java.util.Scanner;

public class TotalNoOfOccurencesInString {

	public static void main(String[] args) {
		Scanner sc= new  Scanner(System.in);
		String s=sc.nextLine();
		//String s ="hello world";
		char target='l';
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==target) {
				count++;
			}		
		}
		System.out.println(count);
	
	}
}
