package prachi.Prachi_Assignment_11;

public class ClassC {

	void m4() {
		System.out.println("This is method m4 from Class C");
		ClassC c1=new ClassC();
		c1.m5();
	} 

	void m5() {
		System.out.println("This is method m5 from Class C");
		ClassD.m6();
	} 

	public static void main(String[] args) {
		ClassC c=new ClassC();
		c.m4();
	}
}
