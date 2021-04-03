package technocredits.communicationBtwClasses;

public class A {
	static B b; // null
	static String name; // null

	void m1() { //3
		name = "Monika"; //4
		b = new B(); //5
		System.out.println("I am in A m1"); // 6
		b.m2(); // 7
	} // 18

	void m3() { // 20
		System.out.println("A m3"); //21
		System.out.println(name); // null /22
		if (b == null) { //23
			b = new B();
		}//24
		b.m2();//25
	} //35

	public static void main(String[] args) {
		A a1 = new A(); // 1
		a1.m1(); // 2
		a1.m3(); // 19
	} //36
}
