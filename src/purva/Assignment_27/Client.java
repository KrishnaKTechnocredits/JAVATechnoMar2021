package purva.Assignment_27;

public class Client {

	public static void main(String[] args) {
		///case 1
		Parent p = new Parent();
		
		System.out.println("Inheritance case1:");
		System.out.println(p.x);
		System.out.println(p.y);
		//System.out.prntln(p.z);//z variable is not define in class parent
		p.method1();
		p.method2();
		//p.method3();//method m3 is not defined in parent
		
		///Case 2
		Child c =new Child();
		
		System.out.println("Inheritance case2:");
		System.out.println(c.x);//take child value
		System.out.println(c.y);//child
		System.out.println(c.z);//child
		c.method1();//parent
		c.method2();//child
		c.method3();//child
		
		//case3
		Parent p1 = new Child();
		
		System.out.println("Inheritance case3:");
		System.out.println(p1.x);//during runtime it guarantee child class behavior
		System.out.println(p1.y);
		//System.out.prntln(p1.z);//during compile time it guarantee of parent variable and method
		p1.method1();
		p1.method2();
		//p.method3();//during compile time it guarantee of parent variable and method
		
		//case4
		//Child child = new Parent()//without type casting we cannot allow refernce of child to parent class object
		
		//case 5
		Parent p2 = new Parent();
		Child c1 = new Child();
		p2 = c1;
		System.out.println("Inheritance case5:");
		System.out.println(p2.x);//during runtime it guarantee child class behavior
		System.out.println(p2.y);
		//System.out.prntln(p1.z);//during compile time it guarantee of parent variable and method
		p2.method1();
		p2.method2();
		//p2.method3();//during compile time it guarantee of parent variable and method
		
		//case 6
		Parent p3 = new Parent();
		Parent c2 = new Child();
		c2 = p3;
		
		System.out.println("Inheritance case6:");
		System.out.println(p3.x);
		System.out.println(p3.y);
		//System.out.prntln(p3.z);//z variable is not define in class parent
		p3.method1();
		p3.method2();
		//p3.method3();//method m3 is not defined in parent
		
		//case 7
		//Child c3 = new Parent();//cannot assign child to parent
		//Child c4 = new Child();
		//c3 = c4;
		
	}

}
