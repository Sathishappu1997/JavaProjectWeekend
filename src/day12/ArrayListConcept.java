package day12;

import java.util.ArrayList;
import java.util.List;

public class ArrayListConcept {
	
	public static void main(String[] args) {
		arrayListHandling();
	}
	
	private static void arrayListHandling() {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		
		System.out.println(list);
		
		list.add(2, 100);
		System.out.println(list);
		System.out.println("******************");
		
		list.addFirst(101);
		list.addLast(200);
		System.out.println(list);
		System.out.println("******************");
		
//		list.clear();
//		System.out.println(list);
//		System.out.println("******************");
		
		Object clone = list.clone();
		System.out.println(clone);
		System.out.println("******************");
		
		System.out.println(list.contains(105));
		System.out.println("******************");
		
		list.add(300);
		System.out.println(list.equals(clone));
		System.out.println("******************");
		
		System.out.println(list.get(5));
		System.out.println("******************");
		
		System.out.println(list.getFirst());
		System.out.println("******************");
		
		System.out.println(list.getLast());
		System.out.println("******************");
		
		System.out.println(list.indexOf(40));
		System.out.println("******************");
		
//		list.clear();
		System.out.println(list.isEmpty());
		System.out.println("******************");
		
		list.add(40);
		System.out.println(list.lastIndexOf(40));
		System.out.println("******************");
		
		System.out.println(list);
		list.remove(8);
		System.out.println(list);
		System.out.println("******************");
		
		System.out.println(list.size());
		System.out.println("******************");
		
		List<Integer> sublist = list.subList(2, 6);
		System.out.println(sublist);
		System.out.println("******************");
		
		System.out.println(list.getClass().getName());
		
		String convert = list.toString();
		System.out.println(convert);
		System.out.println(convert.getClass().getName());
		System.out.println("******************");
		
		List list2 = new ArrayList();
		list2.add(10);
		list2.add(10.045);
		list2.add(1074185963);
		list2.add(true);
		list2.add('V');
		list2.add("Sathish");
		list2.add(107523.951752);
		
		System.out.println(list2);
		System.out.println("******************");
		
		for(Integer a : list) {
			System.out.println(a);
		}
		
		System.out.println("******************");
		
		for(Object b : list2) {
			System.out.println(b);
		}
		
		System.out.println("******************");
		
		int lenght = list.size();
		for(int i = 0 ; i < lenght ; i++) {
			System.out.println(list.get(i));
		}
	}

}
