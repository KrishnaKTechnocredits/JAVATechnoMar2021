package technocredits.multiThreading;

public class Manager {

	static void m3() {
		for(int index = 1000;index<=1100;index++) {
			System.out.println(index);
		}
	}
	public static void main(String[] args) {
		System.out.println("Hi");
		Employee1 e1 = new Employee1();
		Employee2 e2 = new Employee2();
		e1.start(); // 1 to 50, 51 to 100
		System.out.println("1111");
		e2.start(); // 
		m3();
		System.out.println("End");
	}
}
