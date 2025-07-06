package day04;

public class SwitchStatement {
	
	public static void main(String[] args) {
		new SwitchStatement().switchConcept();
	}
	
	public void switchConcept() {
		
		int a = 9;
		
		switch(a) {
		
		case 5 :
			System.out.println("A is 5");
			break;
		case 6 :
			System.out.println("A is 6");
			break;
		case 7 :
			System.out.println("A is 7");
			break;
		case 8 :
			System.out.println("A is 8");
			break;
		default :
			System.out.println("No Matching");
		
		}
		
	}

}
