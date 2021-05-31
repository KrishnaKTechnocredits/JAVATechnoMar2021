package monika.Practise1.Revision;
import monika.Practise1.Revision.Test2;

public class ExtraTest1 {

	 int i;

	ExtraTest1() {
		this.i = 1;
		System.out.println(i);
	}

	ExtraTest1(int i) {
		this.i = i;
	}
	void indexOf() {
		String s1 = "technocredits";
		String s2 = new String("123technocredits");
		String s3 = new String();
		// System.out.println("***"+s2.length());
		System.out.println("++++" + s1.equals(s2));
		//System.out.println("&&&" + s2.contains("tech"));
		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		System.out.println("S3: " + s3);
		System.out.println("equal operator: "+s1 == s2);
		s1.toString();
	}


	public static void main(String[] args) {
		ExtraTest1 t = new ExtraTest1();
		// m1(new Manager());
		// m5();
		
		System.out.println("Value of t " + t);
		System.out.println(t.i);
		ExtraTest1 t1 = new ExtraTest1(10);
		System.out.println("Value of t1 " + t1);
		System.out.println(t.i);
		System.out.println("--------------");
		t.indexOf();
		
		System.out.println("********");
		t.m1(new Manager(10));
		
		StringBuffer s = new StringBuffer();
		System.out.println("\n"+"---"+s);
	}
	
	void m1(Manager m) {
		new Manager(10).m1();
	System.out.println(m);
	//m4(m);
}
	

/*void m4(Manager m) {
	System.out.println(m);
}*/

/*	static void m5() {
	StringBuffer s = new StringBuffer("Hi");
	System.out.println("---" + s);
	System.out.println(s.append(1));
}*/

}
