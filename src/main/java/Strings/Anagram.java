package Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Anagram {

	public static void main(String[] args) {
		
		String[] strr= {"earn","near","here"};
		
		System.out.println(strr.length);
		for(int i=0;i<strr.length;i++) {
			for(int j=i+1;j<strr.length;j++) {
				String str1=strr[i];
				String str2=strr[j];
				String[] arr1=str1.split("");
				ArrayList<String> str= new ArrayList<>();
				
				for(String c :arr1) {
					str.add(c);
				}
				
				String[] arr2=str2.split("");
				ArrayList<String> list= new ArrayList<>();
				
				for(String c :arr2) {
					list.add(c);
				}
				
				
				Collections.sort(str);
				Collections.sort(list);
				
				if(str.equals(list)) {
					System.out.println(strr[i]+ " "+strr[j]+ " are Anagrams");
				}
			}
		}
		
		
		
	}
}
