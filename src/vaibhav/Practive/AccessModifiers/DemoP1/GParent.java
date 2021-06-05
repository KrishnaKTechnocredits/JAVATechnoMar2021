package vaibhav.Practive.AccessModifiers.DemoP1;

public class GParent {

	private void m1() {
		System.out.println("GParent -> private    m1");
		System.out.println("");
	}
	
	void m2() {
		System.out.println("GParent -> default    m2");
		m1();
		
	}
	
	protected void m3() {
		System.out.println("GParent -> protected  m3");
		m2();
		
	}
	
	public void m4() {
		System.out.println("GParent -> public     m4");
		m3();
	
	}
}
