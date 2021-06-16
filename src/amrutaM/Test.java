package amrutaM;

public class Test {

	String name;

	void setName(String stdName) {
		name = stdName;
	}
	
	void display() {
		System.out.println("Student name is: "+name);
	}

	public static void main(String[] args) {
		Test test = new Test();
		test.setName("Amruta M");
		test.display();
	}
}
