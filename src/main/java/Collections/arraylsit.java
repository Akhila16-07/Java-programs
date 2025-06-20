package Collections;

import java.util.ArrayList;
import java.util.List;

public class arraylsit {

	public static void main(String[] args) {
		
		List<Integer> intlist=new ArrayList<>();
		intlist.add(100);
		intlist.add(222);
		intlist.add(288);
		intlist.add(266);
		intlist.add(277);
		intlist.add(277);
		intlist.add(277);
		System.out.println(intlist);
		
		intlist.remove(4);
		System.out.println(intlist);
		
		System.out.println(intlist.get(3));
	}
}
