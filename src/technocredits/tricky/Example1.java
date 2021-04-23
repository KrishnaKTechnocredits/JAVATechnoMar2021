
package technocredits.tricky;

public class Example1 {

	int m1(String name) {
		return name.length();
	}

	void m2(float price) {
		System.out.println(price);
	}

	String m3(boolean flag) {
		if (flag) 
			return "Techno";
		return "Credits";
	}
	
	Example1 m4(){
		return new Example1();
	}
	

	public static void main(String[] args) {
		System.out.print("Techno");
	}
}
