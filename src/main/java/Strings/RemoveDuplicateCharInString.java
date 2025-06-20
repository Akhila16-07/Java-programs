package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharInString {

	public static void main(String[] args) {
		String str="Akhilaareddy";
		char[] arr=str.toCharArray();

		Set<Character> actual=new LinkedHashSet<>();
		for(char c:arr){
			actual.add(c);
		}
		System.out.println(actual);

	}
}
