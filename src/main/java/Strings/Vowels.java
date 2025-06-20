package Strings;

public class Vowels {

	public static void main(String[] args) {
		
		String str="Akhila";
		String strr=str.toLowerCase();
		char[] c= strr.toCharArray();
		
		for(char ch:c) {
			if(ch=='a' || ch=='e' || ch=='i'|| ch=='o' || ch=='u') {
				System.out.println(ch);
			}
		}
	}
}
