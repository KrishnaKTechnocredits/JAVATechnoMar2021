package amruta.Assignment_11;

public class Astaticnonstatic {
	void methodM1() {
		
		System.out.println("Method M1 of Class A ");

		//Calling m2 method of Class B
		Bstaticnonstatic b1 = new Bstaticnonstatic(); 
		b1.methodM2();
	}

	public static void main(String[] args) {
		Astaticnonstatic a = new Astaticnonstatic();
		a.methodM1();
	}

}
