package day03;

import java.util.Scanner;

public class ScannerClass {
	
	public static void main(String[] args) {
		ScannerClass add = new ScannerClass();
//		add.addition();
		add.greetings();
	}
	
	public void addition() {
		
		System.out.println("Hi Good Morning");
		System.out.println("This Method is used to add the Numbers");
		System.out.println("Please pass the two numbers to add");
		
		Scanner scan = new Scanner(System.in); //Creating Object for Scanner class 
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		System.out.println("The Addition of Two Numbers is "+(a+b));
		
		System.out.println("Thank you.....");
		
	}
	
	public void greetings() {
		
		System.out.println("Waiting for Client");

		Scanner scan = new Scanner(System.in);
//		String name = scan.next();
		String name = scan.nextLine();
		
		System.out.println("Hi "+name+"... Welcome to India");
		
	}

}
