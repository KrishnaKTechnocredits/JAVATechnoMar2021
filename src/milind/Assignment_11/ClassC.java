package milind.Assignment_11;

public class ClassC {
    void m4() {
	System.out.println("Called method m4");
	m5();
 }

	void m5() {
		System.out.println("Called method m5");
		ClassD.m6();
	}
}
