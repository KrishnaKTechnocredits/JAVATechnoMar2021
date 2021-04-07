/* from static method to static method direct calling is allowed in same class and for another class we have to mention it with class name.
-> from non static method to non static method direct calling is allowed in same class and if different class then we have to create object of that class and on reference variable we have to access non static methods..
-> from non static method to static method direct calling is allowed and if its in different class then with class name.
-> from static method to non static method direct calling is not allowed, we have to create object of that class and on reference variable we have to access non static methods.
 */
package aparna.staticNonStaticCalling;

public class A {

	void m1() {
		System.out.println("I am in m1 method of Class A");
		B b = new B();
		b.m2();// from Non static method m1() of Class A to non static method m2() of Class B
				// direct calling is not allowed.we have to create object of class B and on
				// reference variable we have to access non static method m2().
	}

	public static void main(String[] args) {// Starting point of the program Execution

		A a = new A();
		a.m1();// from static method main() of class A to non static method m1()of class A
				// direct calling is not allowed.we have to create object of class A and on
				// reference variable we have to access non static method m1().

	}

}
