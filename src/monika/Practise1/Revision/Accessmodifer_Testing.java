package monika.Practise1.Revision;

public class Accessmodifer_Testing {
	
	static protected int x = 10;
	
	static private int y = 100;
	
	protected int m1() {
		private1();
		System.out.println(y);
		System.out.println("M1");
		return this.x = 20;
	}

	static protected int m2() {
		System.out.println(y);
		System.out.println("Jai");
		return 4;
	}
	
	private void private1() {
		System.out.println("Private method");
		
	}
}
