package day11;
//Try and Catch Block
public class Addition {
	
	public static void main(String[] args) {
		
		System.out.println("Hiiii");
		
		try {
			int a = 15;
			int b = 0;
			
			int c = a/b;
			System.out.println(c);
			
			int[] d = {1, 2};
			System.out.println(d[3]);
			
		}/*catch(ArithmeticException e) {
			System.out.println("I am facing exception");
//			System.out.println(e);
//			System.out.println(e.getMessage());
			e.printStackTrace();
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("I am facing exception");
			e.printStackTrace();
		}*/catch(Exception e) {
			System.out.println("I am facing exception");
			e.printStackTrace();
		}
		
		System.out.println("Byeee");
		
	}

}
