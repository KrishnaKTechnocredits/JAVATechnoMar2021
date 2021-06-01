package pallavi.Assignment_27;

public class Test {

	public static void main(String[] args) {

		System.out.println("--------------Case 1-------------");
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		// System.out.println(a.z); // Throw compiler error because there no such
		// variable exists in class A
		a.m1();
		a.m2();
		// a.m3(); Throw compiler error because there no any m3() exists in class A

		System.out.println("------------Case 2------------------");
		B b = new B();
		System.out.println(b.x); // will take this variable from class A
		System.out.println(b.y);
		System.out.println(b.z);
		b.m1(); // m1() will be called by class A
		b.m2();// m2() method is present in both class but priority is given to class B
		b.m3();

		System.out.println("-------------------------Case 3----------------");
		A a1 = new B(); // calling child class object using parent class reference variable
		System.out.println(a1.x); // 10
		System.out.println(a1.y);// 12
		// System.out.println(a1.z); //CE - because compiler will compile considering
		// class A and in class A there is no any z variable is availablSe
		a1.m1(); // A m1
		a1.m2();// B m2() method is present in both class but at runtime child class method will
				// print
		// a1.m3(); //CE :method not present in class A

		System.out.println("--------------Case 4-----------------");
		// B b1=new A() CE- will throw compilation error because we are calling parent
		// method using child class refrence which is not possible

		System.out.println("-----------------Case 5-----------------------"); // Same as case 3
		A a2 = new A();
		B b2 = new B();
		a2 = b2; // A a2 = new B();
		System.out.println(a2.x);// 10
		System.out.println(a2.y);// 12
		// System.out.println(a2.z); // CE :class A doesn't have z variable
		a2.m1();// A m1
		a2.m2(); // B m2()
		// a2.m3(); // CE : class A dosen't have m3()

		System.out.println("-------------Case 6-----------------"); // Same as case1

		A a3 = new A();
		A b3 = new B();
		b3 = a3; // A b3 = new A();
		System.out.println(b3.x);// 10
		System.out.println(b3.y);// 12
		// System.out.println(b3.z); // CE- z is not present in class A
		b3.m1();// A m1
		b3.m2(); // A m2
		// b3.m3(); //CE

		System.out.println("--------------case 7-------------");
		// B b1=new A(); CE:
		B b4 = new B();

	}

}
