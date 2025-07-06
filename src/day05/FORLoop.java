package day05;

public class FORLoop {
	
	public static void main(String[] args) {
		FORLoop forl = new FORLoop();
		forl.forLoopMethod();
	}

	private void forLoopMethod() {
		/*
		//Priting Hii
		for(int i=1 ; i<=25 ; i++) {
			System.out.println("Hii");
		}
		
		//Print 1 to 15
		for(int i = 1 ; i <= 15 ; i++) {
			System.out.println("Count " +i);
		}
		
		for(int i = 1 ; i <= 20 ; i++) {
			if(i <= 10) {
				System.out.println("Count "+i);
			}
		}
		
		for(int i = 1 ; i <= 25 ; i++) {
			
			if(i <= 10) {
				System.out.println(i+" Arjum");
			}else if(i >10 && i <= 20) {
				System.out.println(i+" Sathish");
			}else {
				System.out.println("Ram");
			}
			
		}
		
		*/
		
		int evenNum = 0;
		int oddNum = 0;
		
		for(int i = 1 ; i <= 25 ; i++) {
			int rem = i%2;
			if(rem == 0) {
				System.out.println(i+" is a Even Number");
				evenNum++;
			}else {
				System.out.println(i+" is a Odd Number");
				oddNum++;
			}
		}
		System.out.println();
		System.out.println("The Total Even Number is "+evenNum);
		System.out.println("The Total Odd Number is "+oddNum);
		
	}
}
