package technocredits.StringDemo;

public class Example9 {

	String str3 = ""; // Initialized // Empty
	String str4; // Non-Initialized
	
	void m1() {
		if(str3 == null)
			System.out.println("Hi");
		else
			System.out.println("Hello");
	}
	
	public static void main(String[] args) {
		String str1 = new String("Hi");
		String str2 = new String("Hi");
		str1 = str2;
		System.out.println("Hi".equals(str2));
		System.out.println(str1 == str2);
	
		new Example9().m1();
	}
}
