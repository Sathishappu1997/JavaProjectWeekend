package day06;

public class StaticMethodConcept {
	
	public static void main(String[] args) {
		
//		StaticMethodConcept method = new StaticMethodConcept();
//		method.nonStaticMethod();
//		method.staticMethod();
//		StaticMethodConcept.staticMethod();
		staticMethod();
		
	}
	
	public void nonStaticMethod() {
		System.out.println("Non Static Method");
	}
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}

}
