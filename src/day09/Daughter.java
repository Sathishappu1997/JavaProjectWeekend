package day09;

public class Daughter extends Father {

	public void daughtersHusband() {
		System.out.println("Daughters Husband");
	}
	
	public void kids() {
		System.out.println("Daughters Kids");
	}
	
	public static void main(String[] args) {
		
		Daughter dau = new Daughter();
		dau.daughtersHusband();
		dau.kids();
		
		System.out.println("*************");
		
		dau.father();
		dau.mother();
		System.out.println(dau.name);
		
		System.out.println("*************");
		
		dau.grandFather();
		dau.grandMother();
		
	}
	
}
