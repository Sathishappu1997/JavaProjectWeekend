package day10;

public class ArjunBank extends RBI{

	public void rules() {
		System.out.println("Net Banking should have Profile Picture");
	}

	public void aadharCard() {
		System.out.println("Send Ads to their Phone");
	}

	public void panCard() {
		System.out.println("Request Loan with Balance");
	}

	public void minBalance() {
		System.out.println("Send SMS for Minimum Balance");
	}
	
	public static void main(String[] args) {
		
		ArjunBank arjun = new ArjunBank();
		arjun.aadharCard();
		arjun.panCard();
		arjun.minBalance();
		
		arjun.rules();
		
		arjun.bankDocuments();
		arjun.bankAsset();
		
	}
	
}
