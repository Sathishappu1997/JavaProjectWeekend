package day12;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetConcept {
	
	public static void main(String[] args) {
//		hashSetHandling();
//		removeDuplicateFromName("Arjun Jayaraj");
		removeDuplicateWords("the sentence is have multiple duplicate words . words are in different values. the solution is to remove it");
	}
	
	private static void hashSetHandling() {
		
		Set<Integer> set = new LinkedHashSet<Integer>();
		
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
	
	public static void removeDuplicateFromName(String name) {
		
		System.out.println("Before removing Duplicates : "+name);
		
		char[] names = name.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(char a : names) {
			set.add(a);
		}
		
		System.out.print("After removing Duplicates : ");
		
		for(Character b : set) {
			System.out.print(b);
		}
		
	}
	
	public static void removeDuplicateWords(String sentence) {
		System.out.println("Before removing Duplicates : "+sentence);
		
		String[] words = sentence.split(" ");
		
		Set<String> set = new LinkedHashSet<String>();
		
		for(String word : words) {
			set.add(word);
		}
		
		System.out.print("After removing Duplicates : ");
		
		for(String a : set) {
			System.out.print(a+" ");
		}
	}

}
