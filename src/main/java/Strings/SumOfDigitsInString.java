package Strings;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SumOfDigitsInString {

	public static void main(String[] args) {
		
		String[] str={"saas","mass","mom"};
		//System.out.println(str.length);
		for(int i=0;i<str.length;i++){
			String rev="";
			String s=str[i];
			//System.out.println(s);
			
			for(int j=s.length()-1;j>=0;j--){
			  rev=rev+s.charAt(j);
			}
			//System.out.println(rev);
			if(str[i].equals(rev)) {
				System.out.println(str[i] +" is palidorme");
			}else {
				System.out.println(str[i] + " not a palindorme" );
			}
		}	
		
		
		
	}
}
