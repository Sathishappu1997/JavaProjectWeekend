package day02;

public class CallingMethodInSameClass {
	
	public void photos() {
		
		System.out.println("We are maintaing the Photos inside this");
		
	}
	
	public static void main(String[] args) {
		
		new CallingMethodInSameClass().photos();
		
	}

}
