package day10;

public class MethodOverloading {
	
	public static void main(String[] args) {
		MethodOverloading overload = new MethodOverloading();
		overload.method();
		overload.method(5);
		overload.method("Arjun");
		overload.method("Arjun", 100);
	}
	
	private void method() {
		System.out.println("Method");
	}
	
	private void method(int a) {
		System.out.println("Method is having "+a);
	}
	
	private void method(String a) {
		System.out.println("Method is having "+a);
	}
	
	private void method(String a, int b) {
		System.out.println("Method is having "+a+" "+b);
	}

}
