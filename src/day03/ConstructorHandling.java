package day03;

public class ConstructorHandling {
	
	public static void main(String[] args) {
		
		//ConstructorHandling marg = new ConstructorHandling("Tirupathi"); //This will call the Parameter constructor
		ConstructorHandling marg = new ConstructorHandling(); //This will call the Non Parameter constructor
		marg.couples();
		 
		
	}
	
	public ConstructorHandling(){
		System.out.println("Put Kolam in Vaasal");
		System.out.println("Clean the Rooms");
		System.out.println("Prepare the foods");
	}
	
	public ConstructorHandling(String templeName) {
		System.out.println("Booking Tickets for "+templeName);
		System.out.println("Arrange the Cabs for Travel");
		System.out.println("Prepare the foods while Travling");
	}
	
	public void couples() {
		
		System.out.println("Take Aarthi");
		System.out.println("Arrange the bags");
		System.out.println("Having the foods");
		
	}

}
