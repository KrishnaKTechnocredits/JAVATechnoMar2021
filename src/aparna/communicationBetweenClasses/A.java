/*communication between classes example:-
 * communication between ClassA , ClassB and ClassC
 */

package aparna.communicationBetweenClasses;

public class A {

	void multiplication(int num1,int num2) {
		System.out.println("result of multiplication : "+(num1*num2));
		B b = new B();
		b.subtraction(4,2);
	}

	public static void main(String[] args) {
		A a = new A();
		a.multiplication(4,2);
	}
	}
