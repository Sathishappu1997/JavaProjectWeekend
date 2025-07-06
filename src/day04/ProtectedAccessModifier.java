package day04;

public class ProtectedAccessModifier {
	
	public static void main(String[] args) {
		new ProtectedAccessModifier().proctectedMethod();
	}
	
	protected void proctectedMethod() {
		System.out.println("Protected Method");
	}

}
