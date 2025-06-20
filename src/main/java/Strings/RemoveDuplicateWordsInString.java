package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsInString {

	public static void main(String[] args) {
		
		String str="man not man good but also but";
		String[] words=str.split("\\s");
		int numOfWords=words.length;
		Set<String> s1= new LinkedHashSet<>();
		for(String s:words) {
			s1.add(s);
		}
		//String result=String.join(" ", s1);
		System.out.println(s1);
		
		
	}
}
