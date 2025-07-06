package day11;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) { //throws FileNotFoundException, {
		
		fileFound();

	}

	private static void fileFound() {

		System.out.println("Hiiii");

		try {
			new FileInputStream("");
		} catch (FileNotFoundException e) {
			
			System.out.println("Getting Exception");
			System.out.println(e);
			
			System.out.println("Redirecting to Solution");
			
			solution();
		}

		System.out.println("Byeeee");

	}
	
	private static void solution() {
		
		System.out.println("For that Exceptiion");
		System.out.println("This is the solution");

	}

}