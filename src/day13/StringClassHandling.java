package day13;

public class StringClassHandling {
	
	public static void main(String[] args) {
		stringClassMethod();
	}

	private static void stringClassMethod() {

		String a = "  Sathish ";
		String b = "Sathish is the Teacher";
		
		String d = "SATHISH";
		
		String c = new String("Arjun");
		
		if(a.equals(c)) {
			System.out.println("Equal");
		}
		
		System.out.println(a.charAt(3));
		System.out.println(a.concat(" Kumar"));
		
		String newname = a.concat(" Kumar");
		
		System.out.println(a.contains("S"));
		System.out.println(a.contentEquals("Sathish"));
		
		System.out.println(c.endsWith("n"));
		System.out.println(d.equalsIgnoreCase("sathish"));
		
		System.out.println(a.indexOf("a"));
		System.out.println(a.length());
		
		System.out.println(a.replace("S", "Z"));
		System.out.println(a.replace("th", "XI"));
		
		System.out.println(b.replace("th", "XI"));
		System.out.println(b.replaceFirst("th", "OI"));
		
		System.out.println(a.strip());
//		System.out.println(a.trim());
		
		System.out.println(b.substring(11));
		System.out.println(b.substring(11, 16));
		
		for(char z : a.toCharArray()) {
			System.out.println(z);
		}
		
		System.out.println(a.toUpperCase());
		System.out.println(a.toLowerCase());
		
		int g = 5;
		String num = String.valueOf(g);
		System.out.println(num);
		
		System.out.println(num.getClass().getName());
		
	}

}
