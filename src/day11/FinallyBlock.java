package day11;

public class FinallyBlock {

	public static void main(String[] args) {

		System.out.println("Hiiii");

		try {
			int a = 15;
			int b = 0;

			int c = a/b;
			System.out.println(c);

			int[] d = {1, 2};
			System.out.println(d[0]);

		}catch(Exception e) {
			System.out.println("I am facing exception");
			e.printStackTrace();
		}finally {
			System.out.println("Last Segment");
		}


	}

}
