package day10;

public class MethodOverridingChild extends MethodOverridingParent {
	
	public static void main(String[] args) {
//		new MethodOverridingChild().son();
//		new MethodOverridingChild().parentSon();
		
		MethodOverridingParent riding = new MethodOverridingChild();
		riding.son();
	}
	
	public void son() {
		System.out.println("Sathish");
	}
	
	public void parentSon() {
		super.son();
	}

}
