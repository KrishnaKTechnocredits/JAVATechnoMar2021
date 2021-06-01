package technocredits.accessModifierDemo.p2;

import technocredits.accessModifierDemo.p1.A;
public class B {

	public static void main(String[] args) {
		A a = new A();
		//a.m1(); // cant access default method outside of the package.
	}
}
