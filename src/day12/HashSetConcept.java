package day12;

import java.util.HashSet;
import java.util.Set;

public class HashSetConcept {
	
	public static void main(String[] args) {
		hashSetHandling();
	}
	
	private static void hashSetHandling() {
		
		Set<Integer> set = new HashSet<Integer>();
		
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(50);
		set.add(30);
		
		System.out.println(set);
		System.out.println("******************");
		
		set.remove(50);
		
		System.out.println(set);
		
	}

}
