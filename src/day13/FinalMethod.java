package day13;

public class FinalMethod {
	
	public final void finalMethodConcept() { //Final Keyword Method - We cannot override the method in child class using the inherite concept
		System.out.println("Hiiiiii");
	}

}

class parent extends FinalMethod{
	
	public static void main(String[] args) {
		
		new FinalMethod().finalMethodConcept();
		
	}
	
//	public void finalMethodConcept() {
//		
//	}
	
}