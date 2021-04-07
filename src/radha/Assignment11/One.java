package radha.Assignment11;

public class One {
	
	void m1() {
		System.out.println("This is method m1 of class One.");
		Two two = new Two();
		two.m2();
	}
	
	public static void main(String[] args) {
		One one = new One();
		one.m1();
	}

}
