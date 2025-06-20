package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SortInDecendingOrder {

	public static void main(String[] args) {
		
		List<Integer> list= new ArrayList<>();
		list.add(13);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(72);
		list.add(32);
		list.add(1);
		
		//Collections.sort(list);
	//	System.out.println(list);
		int max=list.get(1);//5
		
		LinkedList<Integer> decending= new LinkedList<>();
		int temp =0;
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					temp=list.get(i);
					list.set(i,list.get(j));
					list.set(j,temp);
				}
			}
//			if(list.get(i)>max) {
//				max=list.get(i);
//				decending.addFirst(max);
//			}else {
//				decending.addLast(list.get(i));
//			}
			
		}
		System.out.println(list);
		ascendingOrder();

	}
	
	public static void ascendingOrder() {
		List<Integer> list= new ArrayList<>();
		list.add(13);
		list.add(5);
		list.add(3);
		list.add(4);
		list.add(72);
		list.add(32);
		list.add(1);
		
		int min=list.get(1);
		LinkedList<Integer> asc=new LinkedList<>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i)<min) {
				min=list.get(i);
				asc.addFirst(min);
			}else {
				asc.addLast(list.get(i));
			}
		}
		System.out.println(asc);
	}
}

