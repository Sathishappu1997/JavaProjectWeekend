package day06;

public class StaticVariable {
	
	int a = 15;
	static int b = 5;
	
	public static void main(String[] args) {
		StaticVariable staticVariable = new StaticVariable();
		staticVariable.staticVariableConcept();
		System.out.println(staticVariable.a);
		
		System.out.println("***********************");
		
		StaticVariable nonStaticVariable = new StaticVariable();
		nonStaticVariable.nonStaticVariableConcept();
		System.out.println(b);

		System.out.println("***********************");
		
		nonStaticVariable.otherMethod();
		System.out.println(b);
	}
	
	private void staticVariableConcept() {

		System.out.println(a);
		int a = 20;
		System.out.println(a);
		
	}
	
	private void nonStaticVariableConcept() {

		System.out.println(b);
		b = 45;
		System.out.println(b);
		
	}
	
	private void otherMethod() {
	
		System.out.println(b);
		b = 67;
		System.out.println(b);

	}

}
