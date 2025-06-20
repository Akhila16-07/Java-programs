package Strings;

import java.util.Arrays;

public class ConvertingToPalindrome {

	public static void main(String[] args) {
		String s= "carrace";
		int len=s.length();
		char[] arr = s.toCharArray();
		String str="";
		for(int j=0;j<3;j++){
			char first=arr[0];	
				for(int i=0;i<len-1;i++){
					arr[i]=arr[i+1];
				}
			arr[len-1]=first;
		}
		System.out.println(Arrays.toString(arr));
		
		for(char c:arr) {
			str+=c;
		}
		System.out.println(str);
		
	String rev=new StringBuilder().append(str).reverse().toString();
	if(rev.equals(str)) {
		System.out.println("is palindrome");
	}else {
		System.out.println("Not a palindrome");
	}
	}
}
