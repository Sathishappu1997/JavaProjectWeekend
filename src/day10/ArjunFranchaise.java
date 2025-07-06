package day10;

public class ArjunFranchaise implements TeaBoyHead, TeaBoyAreaHead {

	public void headTeam() {
		System.out.println("Signing the Documents");
	}

	public void teaCan() {
		System.out.println("1 for Tea, 1 for Coffee, 1 for boost");
	}

	public void heater() {
		System.out.println("Bisucits and Puffs");
	}
	
	public static void main(String[] args) {
		
		ArjunFranchaise arjun = new ArjunFranchaise();
		arjun.headTeam();
		arjun.heater();
		arjun.teaCan();
		
		arjun.collectMoney();
	}

	public void collectMoney() {
		System.out.println("Collect Money on Daily Basis");
	}

}
