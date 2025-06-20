package Strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		
		String[] strArr= {"apple","ball","banana","apple","Ball"};
		Set<String> uni=new LinkedHashSet<>();
		for(String s:strArr) {
			
			uni.add(s.toLowerCase());
		}
		System.out.println(uni);
	}
}
