package monika.Practise1.Revision;

public class VisibilityPurposeClass {
	protected VisibilityPurposeClass() {
		System.out.println("Protected default parent class constructor");
	}
	
	private void m1() {
		System.out.println("Private method ");
	}
	void m2() {
		System.out.println("Default method");
	}
	protected void m3() {
		System.out.println("Protected method");
	}
	public void m4() {
		System.out.println("Public method");
	}

}
