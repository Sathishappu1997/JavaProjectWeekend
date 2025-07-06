package day11;

public class CreatingOwnException {
	
	public static void main(String[] args){
		
		System.out.println("Hiiii");
		
		int a = 51;
		
		if(a == 5) {
			System.out.println("Validation Fine");
		}else {
//			System.out.println("Validation Not Fine");
			throw new ValidationMistmachException("Validation Not Fine");
		}
		
	}

}
