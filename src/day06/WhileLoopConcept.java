package day06;

public class WhileLoopConcept {
	
	public static void main(String[] args) {
		new WhileLoopConcept().whileLoopHandling();
	}
	
	private void whileLoopHandling() {

		/*
		int a = 5;
		int b = 1;
		
		while(a == 5){
			System.out.println(b+" A is 5");
			b++;
		}
		
		int a = 1;
		
		while(a <= 5) {
			System.out.println(a+" A is 5");
			a++;
		}
		
		int a = 5;
		
		while(a > 5) {
			System.out.println(a);
		}
		*/
		
		int a = 1;
		
		while(a <= 12) {
			System.out.println("5 X "+a+" = "+a*5);
			a++;
		}
	}

}
