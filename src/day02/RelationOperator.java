package day02;

public class RelationOperator {
	
	public static void main(String[] args) {
		new RelationOperator().relation();
	}

	public void relation() {
		
		//>, <, >=, <= !=
		int a = 6;
		int b = 5;
		
		boolean c = a>b;
		System.out.println(c);
		
		System.out.println(a<b);
		
		System.out.println(a<=b);
		
		System.out.println(a>=b);
		
		System.out.println(a!=b);
		
	}
}
