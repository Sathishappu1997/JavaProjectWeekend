package day06;

public class LocalAndClassLevelVariable {
	
	int a = 15; //Class Level Varibale or Instance Varibale
	int b = 5;
	
	public static void main(String[] args) {
		LocalAndClassLevelVariable arith = new LocalAndClassLevelVariable();
		arith.add();
		arith.sub();
		arith.multi();
		arith.div();
	}
	
	private void add() {
//		int a = 15; //Local Variable
//		int b = 5;
		System.out.println("The Add is "+(a+b));
	}
	
	private void sub() {
//		int a = 15;
//		int b = 5;
		System.out.println("The Sub is "+(a-b));
	}
	
	private void multi() {
//		int a = 15;
//		int b = 5;
		System.out.println("The Multi is "+(a*b));
	}
	
	private void div() {
//		int a = 15;
//		int b = 5;
		System.out.println("The Div is "+(a/b));
	}

}
