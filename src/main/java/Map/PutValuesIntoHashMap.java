package Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PutValuesIntoHashMap {

	public static void main(String[] args) {
		
		HashMap<Integer,String> values= new HashMap<>();
		values.put(1, "Akhi");
		values.put(2, "Sonu");
		values.put(3, "Aunni");
		values.put(3, "Akhi");
		values.put(3, "akhi");
		
		System.out.println(values);
		System.out.println(values.get(1));//get first value
		

		for(Map.Entry<Integer, String> mapValues: values.entrySet()) {
			System.out.println(mapValues.getKey() + " " +mapValues.getValue());
		}			
		values.remove(3);		
		System.out.println(values);
		
		HashMap<Integer,String> values1=new HashMap<>();
		values1.put(66, "sdadad");
		values1.put(33, "asddds");
		
		
		ArrayList<HashMap<Integer,String>> map= new ArrayList<>();
		map.add(values);
		map.add(values1);
		System.out.println(map);
		
	}
}