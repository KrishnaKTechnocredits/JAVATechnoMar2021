package prachi.Prachi_Assignment_11;

public class ClassB {

	void m2() {
		System.out.println("This is method m2 from Class B");
		ClassB.m3();
	} 

	static void m3() {
		System.out.println("This is method m3 from Class B");
	} 

	public static void main(String[] args) {
		ClassB b=new ClassB();
		b.m2();
	}
}
