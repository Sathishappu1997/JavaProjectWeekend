package day03;

public class ParametersAndArguments {
	
	public static void main(String[] args) {
		ParametersAndArguments add = new ParametersAndArguments();
		add.addition(10, 20);
		add.addition(30, 60);
		add.addition(170, 230);
		add.addition(1000, 205);
		
		add.printName("Sathish");
	}
	
	public void addition(int a, int b) {
		System.out.println("The Addition of Two Numbers is "+(a+b));
	}
	
	public void printName(String name) {
		System.out.println("Hi Welcome "+name);
	}
	
	
	
}
