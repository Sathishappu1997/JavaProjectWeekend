package day10;

public abstract class RBI {
	
	//Non Abstract Methods
	public void bankDocuments() {
		System.out.println("Need to collect all Bank Documents");
	}
	
	public void bankAsset() {
		System.out.println("Need to collect all Bank Asset");
	}
	
	//Abstract Methods
	public abstract void aadharCard();
	
	public abstract void panCard();
	
	public abstract void minBalance();

}
