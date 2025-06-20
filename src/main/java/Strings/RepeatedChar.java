package Strings;

public class RepeatedChar {
//find and print first repeated and non repeated char
	public static void main(String[] args) {
		String sentence ="java is easy";
		char assumeRepeated =sentence.charAt(0);
		for(int i =0 ;i<sentence.length();i++) {
			char ch =sentence.charAt(i);
			if(ch==assumeRepeated) {
				System.out.println(ch);
			}
		}
	}
}
