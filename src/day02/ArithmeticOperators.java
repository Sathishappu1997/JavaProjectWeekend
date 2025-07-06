package day02;

public class ArithmeticOperators {

	public static void main(String[] args) {

		new ArithmeticOperators().arithmetic();

	}

	public void arithmetic() {

		//Addition
		int a = 16;
		int b = 5;

		int c = a+b;
		System.out.println("The Addition of Two Numbers is "+(a+b));

		//Subtraction
		int d = a-b;
		System.out.println("The Subtraction of Two Numbers is "+(a-b));

		//Multiplication
		int e = a*b;
		System.out.println("The Multiplication of Two Numbers is "+a*b);

		//Division
		int f = a/b;
		System.out.println("The Division of Two Numbers is "+a/b);
		
		//Modulus
		int g = a%b;
		System.out.println("The Division of Two Numbers is "+a%b);
		
	}

}
