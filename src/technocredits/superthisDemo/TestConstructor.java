package technocredits.superthisDemo;

public class TestConstructor {

	TestConstructor(){
		System.out.println("This is constructor");
	}
	
	void m1() {
		System.out.println("In m1");
	}
	
	public static void main(String[] args) {
		TestConstructor testConstructor = new TestConstructor();
		testConstructor.m1();
	}
}
