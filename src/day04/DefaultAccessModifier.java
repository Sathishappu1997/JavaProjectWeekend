package day04;

public class DefaultAccessModifier {
	
	void defaultMethod() {
		System.out.println("Default Method");
	}
	
	public static void main(String[] args) {
		new DefaultAccessModifier().defaultMethod();
	}

}
