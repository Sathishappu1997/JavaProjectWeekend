package day08;

public class SplitConcept {
	
	public static void main(String[] args) {
		
		String s = "Arjun is good boy";
		//ot - Arjun si good yob
		
		System.out.println(s);
		
		String[] split = s.split("o");
		
		System.out.println(split);
		
		for(String a : split) {
			System.out.println(a);
		}
		
	}

}
