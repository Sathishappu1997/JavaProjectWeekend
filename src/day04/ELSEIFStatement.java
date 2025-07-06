package day04;

public class ELSEIFStatement {
	
	public static void main(String[] args) {
		new ELSEIFStatement().elseIfConcept();
	}
	
	public void elseIfConcept() {
		
		int a = 8;
		
		if(a == 5) {
			System.out.println("A is 5");
		}else if(a == 6){
			System.out.println("A is 6");
		}else if(a == 7){
			System.out.println("A is 7");
		}else {
			System.out.println("A is not matching with any number");
		}
		
	}

}
