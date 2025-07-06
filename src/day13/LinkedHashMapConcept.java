package day13;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapConcept {
	
	public static void main(String[] args) {
		hashMapHandling();
	}

	private static void hashMapHandling() {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		
		map.put("Sathish", 80);
		map.put("Arjun", 90);
		map.put("Suresh", 70);
		map.put("Sundar", 100);
		
		System.out.println(map);
		
		System.out.println(map.containsKey("Sureshaaa"));
		System.out.println(map.containsValue(900));
		
		System.out.println(map.get("Sathish"));
		
		map.putIfAbsent("Suresh", 74);
		
		System.out.println(map);
		
		map.put("Suresh", 100);
		System.out.println(map);
		
		map.remove("Suresh");
		System.out.println(map);
		
		map.remove("Arjun", 90);
		System.out.println(map);
		
		map.replace("Sathish", 150);
		System.out.println(map);
		
		map.replace("Sundar", 100, 200);
		System.out.println(map);
		
		for(Integer a : map.values()) {
			System.out.println(a);
		}
		
		for(String a : map.keySet()) {
			System.out.println(a);
		}
		
		//Interview Question
		for(Entry<String, Integer> a : map.entrySet()) { //It will return the key and value for the same value
			System.out.println(a.getKey()+" : "+a.getValue());
			System.out.println(a);
		}
	}
	

}
