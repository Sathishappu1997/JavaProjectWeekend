package day11;

public class CreatingException {
	
	public static void main(String[] args) {
		additionNumber();
	}

	private static void additionNumber() {

		System.out.println("Welcome");
		
		int a = 51;
		
		if(a == 5) {
			System.out.println("Validation Successful");
			System.out.println("A is 5");
		}else {
//			System.out.println("Validation Not Successful");
			throw new RuntimeException("Validation Not Successful");
		}
		
	}
	
	

}
