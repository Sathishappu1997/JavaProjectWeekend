package day08;

public class RightTriangleStarProgram {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = i ; j < row ; j++) {
				System.out.print("  ");
			}
			for(int k = 1 ; k <= i ; k++) {
				System.out.println("* ");
			}
			System.out.println();
		}
		
		System.out.println("********************************");
		
		
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		System.out.println("********************************");
		
		int num=1;
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}

}
