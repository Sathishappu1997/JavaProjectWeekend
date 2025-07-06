package day09;

public class Customer {

	public static void main(String[] args) {

		Hotel hotel = new Hotel();

		System.out.println(hotel.getMainDish());
		System.out.println(hotel.getSideDish());

		System.out.println("***********************");

		hotel.setMainDish("Mutton Biriyani");
		hotel.setSideDish("Chicken 65");

		System.out.println(hotel.getMainDish());
		System.out.println(hotel.getSideDish());

		Hotel hotel1 = new Hotel();

		System.out.println(hotel1.getMainDish());
		System.out.println(hotel1.getSideDish());

	}

}
