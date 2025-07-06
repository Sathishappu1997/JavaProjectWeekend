package day08;

public class LeftTriangleStarProgram {
	
	public static void main(String[] args) {
		
		int row = 5;
		
		for(int i = 1 ; i <= row ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("* ");
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
