package day02;

public class CreatingMultipleMethods {
	
	public void chennaiPhotos() {
		System.out.println("Chennai Photos");
	}
	
	public void hydrabadPhotos() {
		System.out.println("Hydrabad Photos");
	}
	
	public void banglaorePhotos() {
		System.out.println("Bangalore Photos");
	}
	
	public static void main(String[] args) {
		
//		new CreatingMultipleMethods().chennaiPhotos();
//		new CreatingMultipleMethods().hydrabadPhotos();
//		new CreatingMultipleMethods().banglaorePhotos();
		
		CreatingMultipleMethods ramesh = new CreatingMultipleMethods();
		ramesh.chennaiPhotos();
		ramesh.banglaorePhotos();
		ramesh.hydrabadPhotos();
		
		//CreatingMultipleMethods - Reference Class
		//ramesh - Referance Variable
		// new CreatingMultipleMethods() - Creating Object for CreatingMultipleMethods Class
		
	}

}
