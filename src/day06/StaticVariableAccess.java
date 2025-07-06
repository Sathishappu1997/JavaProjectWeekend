package day06;

public class StaticVariableAccess {
	
	int a = 5;
	static int b = 10;
	
	public void aValue() {
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void bValue() {
		System.out.println(a);
		System.out.println(b);
	}

}
