package day07;

public class SingleDimensionalArray {
	
	public static void main(String[] args) {
		new SingleDimensionalArray().singleArray();
	}
	
	private void singleArray() {

		//Direct Way
		int[] a = {5, 10 ,15 ,20 ,25, 30, 35};
		System.out.println(a);
		
		System.out.println("******************");

		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		
		System.out.println("******************");
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("******************");
		
		for(int num : a) {
			System.out.println(num);
		}
		
		//Object Way
		String[] names = new String[5];
		
		names[0] = "Arjun";
		names[2] = "Sathish";
		names[4] = "Sundar";
		
		System.out.println("******************");
		
		System.out.println(names[0]);
		System.out.println(names[2]);
		System.out.println(names[3]);
		
		System.out.println(names);
		
		System.out.println("******************");
		
		int[] roll = {111, 112, 113, 114, 115};
		String[] student = {"Arjun", "Sathish", "Sundar", "Suresh", "Vijay"};
		
		for(int i = 0 ; i < roll.length ; i++) {
			System.out.println(roll[i]+" : "+student[i]);
		}
		
		System.out.println(roll[2]+" : "+student[2]);
	}

}
