package Strings;

import java.util.HashMap;
import java.util.Map;

public class CountCharsInString {

	public static void main(String[] args) {
		
		String str="abhinav";
		Map<Character,Integer> count = new HashMap<>();
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(count.containsKey(ch)) {
				count.put(ch, count.get(ch)+1);
			}else {
				count.put(ch, 1);
			}
		}
		
	
		
//		char[] arr=str.toCharArray();
//
//		Map<Character,Integer> count = new HashMap<>();
//		for(char c:arr){
//			if(count.containsKey(c)){
//			   count.put(c,count.get(c)+1);
//			}else{
//			   count.put(c,1);
//			}
//		}
		for(Map.Entry<Character,Integer> entCount:count.entrySet()){
	
					System.out.print((entCount.getKey()+ "" +entCount.getValue()));
				}
					
	}
}
