package day04;

public class PublicAccessModifier {
	
	public void publicAccesssModifier() {
		System.out.println("Public Method");
	}
	
	public static void main(String[] args) {
		new PublicAccessModifier().publicAccesssModifier();
	}

}
