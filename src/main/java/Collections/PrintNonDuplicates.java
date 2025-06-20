package Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class PrintNonDuplicates {

	public static void main(String[] args) {
		// print non duplicates
		List<String> list = new ArrayList<>();
		list.add("abhi");
		list.add("mahi");
		list.add("abhi");//
		list.add("aruu");//		
		list.add("sumi");
		list.add("mahi");
		//System.out.println(list);
		List<String> list2 = new ArrayList<>();
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i).equals(list.get(j))) {
					list2.add(list.get(i));	
					//System.out.println(list.get(i));
				}
			}
			
		}
		list.removeAll(list2);
		System.out.println(list);
		
		HashSet<String> hash=new HashSet<>();
		
		for(String a:list) {
			hash.add(a);
		}
		
		//System.out.println(hash);
		
	}
}
