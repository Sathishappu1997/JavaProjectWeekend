package day09;

public class Son extends Father {
	
	public void wife() {
		System.out.println("Wife");
	}
	
	public void dog() {
		System.out.println("Dog");
	}
	
	public static void main(String[] args) {
		
		Son son = new Son();
		son.wife();
		son.dog();
		
		System.out.println("************");
		
		son.mother();
		son.father();
		
		System.out.println(son.name);
		
		System.out.println("************");
		
		son.grandFather();
		son.grandMother();
		
	}

}
