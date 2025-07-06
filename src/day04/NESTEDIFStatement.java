package day04;

public class NESTEDIFStatement {
	
	public static void main(String[] args) {
		new NESTEDIFStatement().nestedIf();
	}
	
	public void nestedIf() {
		
		int a = 5;
		int b = 7;
		
		if(a == 5) {
			
			System.out.println("A is 5");
			
			if(b == 6) {
				System.out.println("B is 6");
			}
		}
		
	}

}
