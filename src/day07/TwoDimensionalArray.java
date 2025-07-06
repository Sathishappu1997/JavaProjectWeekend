package day07;

import java.util.Scanner;

public class TwoDimensionalArray {
	
	public static void main(String[] args) {
//		new TwoDimensionalArray().twoArray();
		new TwoDimensionalArray().scanArra();
	}
	
	private void twoArray() {

		int[][] a = {{1, 2, 9},
				     {3, 4},
				     {5},
				     {7, 8, 12, 25}};
		System.out.println(a);
		
		System.out.println("**********************");
		
		System.out.println(a[0][0]);
		System.out.println(a[2][0]);
		
		System.out.println("**********************");
		
		//a.length = 4
		
		for(int i = 0 ; i < a.length ; i++) { //outer Loop // Rows //1
			for(int j = 0 ; j < a[i].length ; j++) {//inner Loop // Columns //2  //0
				System.out.print(a[i][j]+"  "); //0,2
			}
			System.out.println();
		}
		
	}
	
	private void scanArra() {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter row num to store data in array");
		int rowcount = scan.nextInt();
		
		System.out.println("Enter colum num to store data in array");
		int colcount = scan.nextInt();
		
		int[][] arr = new int[rowcount][colcount];
		
		System.out.println("Please enter first row and first column");
		int rowonecolone = scan.nextInt();
		int rowonecoltwo = scan.nextInt();
		
		arr[0][0] = rowonecolone;
		arr[0][1] = rowonecoltwo;
		
		System.out.println("Please see below for the proper array output");
		
		for(int i = 0 ; i < rowcount ; i++) {
			for(int j = 0 ; j < colcount ; j++) {
				System.out.print(arr[i][j]+"  ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
