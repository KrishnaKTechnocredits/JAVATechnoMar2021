package sandesh.OWN_Practice_Sandesh_1;

public interface ManagerInterface {

	int bb = 10;
	abstract void m1();
	default void m2() {
		
	}
	static void m3() {
		System.out.println("In static m3 method of interface ManagerInterface");

	}
	void m4();
}
