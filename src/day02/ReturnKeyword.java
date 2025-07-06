package day02;

public class ReturnKeyword {
	
	public static void main(String[] args) {
		
		ReturnKeyword lunch = new ReturnKeyword();
//		int returnBalance = lunch.haveLunch();
		String food = lunch.haveLunch();
		
//		System.out.println("Balance AMount is "+returnBalance);
		System.out.println("Owner Food is "+food);
		
	}
	
	public String haveLunch() {
		
		System.out.println("Having lunch with owner Money for 75 Ruppess");
		
//		int bal =25;
		
//		return 25;
		return "Chicken Biriyani";
		
	}

}
