package Collections;

import java.util.ArrayList;
import java.util.List;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<String> str= new ArrayList<>();
		str.add("a");
		str.add("b");
		str.add("a");
		str.add("d");
		str.add("d");
		str.add("d");
		str.add("f");
		str.add("b");
		String duplicates="";
		System.out.println(str.size());
		for(int i=0;i<str.size();i++) {
			//String str1 =str.get(i);
			for(int j=i+1;j<str.size();j++) {
				if(str.get(i).equals(str.get(j)))
				{				
					if((!duplicates.contains(str.get(i)))) {
						duplicates+=str.get(i);
						System.out.print(str.get(i));
					}
				}
			}
		}
	}	
}
