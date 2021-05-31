package monika.Practise1.Revision;


public class Examples_Overriding3_Main {

	public static void main(String[] args) {
		ExtraExamples_Overriding1 o1 = new ExtraExamples_Overriding1();
		System.out.println("Calling parent class object with all vars");
		System.out.println(o1.x2);
		System.out.println(o1.x3);
		System.out.println(o1.x4);
		System.out.println("Calling parent class object with all methods");
		o1.m2();
		o1.m3();
		o1.m4();
		o1.m5();
		// o1.m6(); // CE - method of child class
		Examples_Overriding2 o2 = new Examples_Overriding2();
		System.out.println("Calling child class object with all vars");
		System.out.println(o2.x2);
		System.out.println(o2.x3);
		System.out.println(o2.x4);
		System.out.println("Calling child class object with all methods");
		o2.m2(); // override child class
		o2.m3(); // override child class
		o2.m4(); // override child class
		o2.m5(); // parent class
		o2.m6(); // unique method of child class

		System.out.println("***********************************");
		ExtraExamples_Overriding1 o = new Examples_Overriding2();
		System.out.println("Calling parent class object with all vars");
		System.out.println(o.x2); // parent class
		System.out.println(o.x3); // parent class
		System.out.println(o.x4); // parent class
		System.out.println("Calling parent class object with all methods");
		o.m2();// object class
		o.m3();// object class
		o.m4();// object class
		o.m5(); // parent class
		// o.m6(); // unique method of child class - CE as gurantee of Parent class
		// while compile

	}
}
