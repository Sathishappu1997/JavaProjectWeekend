package day13;

public class FinalVaribale {
	
	final static int a = 5; // Final Keyword in Varibale - We cannot reassign the value in any class or any method
	
	public static void main(String[] args) {
		finalVaribaleConcept();
	}

	private static void finalVaribaleConcept() {

		System.out.println(a);
		
		a = 50;
		
		System.out.println(a);
		
	}

}
