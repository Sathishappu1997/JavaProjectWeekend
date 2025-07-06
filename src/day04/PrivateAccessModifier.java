package day04;

public class PrivateAccessModifier {
	
	private void privateMethod() {
		System.out.println("Private Method");
	}
	
	public static void main(String[] args) {
		new PrivateAccessModifier().privateMethod();
	}

}
