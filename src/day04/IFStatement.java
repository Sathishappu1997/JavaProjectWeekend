package day04;

import java.util.Scanner;

public class IFStatement {

	public static void main(String[] args) {
		IFStatement ifstate = new IFStatement();
//		ifstate.ifConcept();
//		ifstate.ifConcept2();
		ifstate.ifConcept3();
	}

	public void ifConcept() {

		int a = 5;

		System.out.println("Hi");

		if(a == 6) {
			System.out.println("A is 5");
		}

		System.out.println("Bye");

	}

	public void ifConcept2() {
		int a = 5;

		System.out.println("Hi");

		if(a < 6) {
			System.out.println("A is less than 6");
		}

		System.out.println("Bye");
	}
	
	public void ifConcept3() {
		
		System.out.println("Hello Good Morning");
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name = scan.nextLine();
		
		if(name.equals("Sathish Kumar Sekar")) {
			System.out.println(name+" Please welcome");
		}
		
		
	}

}
