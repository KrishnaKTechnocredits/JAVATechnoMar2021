package renuka.assignment27;

public class Case6 {

	public static void main(String[] args) {
		A a1 = new A();
		A b1 = new B();
		b1=a1;
		//ClassA b1 = new ClassA();
		//Same as Case1

		System.out.println(b1.x);
		//10
		System.out.println(b1.y);
		//12
		//System.out.println(b1.z);---compilation error as A don't have variable z
		b1.m1();
		//A m1
		b1.m2();
		//A m2
		//b1.m3();--------------------compilation error as A don't have method m3()

	}

}
