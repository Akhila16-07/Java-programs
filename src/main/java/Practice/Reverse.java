package Practice;

import java.util.LinkedHashSet;
import java.util.Set;

public class Reverse {

	public static void main(String[] args) {
		
		String str="greeksofgreeks";
				char[] charr=str.toCharArray();
			
				//System.out.println(charr);
				Set<Character> unique=new LinkedHashSet<>();

				for(char c:charr){
					unique.add(c);
				}
				System.out.println(unique);

				StringBuilder s=new StringBuilder();
				for(char c:unique) {
					s.append(c);
				}
				System.out.println(s);
	}
}
