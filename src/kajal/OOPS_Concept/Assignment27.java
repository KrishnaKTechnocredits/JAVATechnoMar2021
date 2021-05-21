package kajal.OOPS_Concept;

public class Assignment27 {

	public static void main(String[] args) {
	//case-1
		System.out.println("case-1: ");
		A a = new A();
		System.out.println(a.x);
		System.out.println(a.y);
		//System.out.println(a.z); --> Compilation Error
		a.m1();
		a.m2();
		//a.m3();--> Compilation Error
	System.out.println("-------------------------------");
	
	//case-2
		System.out.println("case-2: ");
		B b = new B();
		System.out.println(b.x);
		System.out.println(b.y);
		System.out.println(b.z); 
		b.m2();
		b.m3();
		b.m1();
	System.out.println("-------------------------------");
	
		//case-3
		System.out.println("case-3: ");
		A a1 = new B();
		System.out.println(a1.x);
		System.out.println(a1.y);
		//System.out.println(a1.z); --> Compilation Error(As class A didn't have variable z, no guarantee for variable z)
		a1.m2();
		//a1.m3();-->Compilation Error(class A didn't have method m3, no guarantee received from class A for method m3)
		a1.m1();
	System.out.println("-------------------------------");
	
	    //case-4
		System.out.println("case-4: Compilation Error");
		//B b = new A();-->Compilation Error(parent class can't be stored in child class)
	System.out.println("-------------------------------");
	
		//case-5
		System.out.println("case-5: ");
		a1 = b; //A a1= new B()
		System.out.println("case 5 is same as case 3");
	System.out.println("-------------------------------");
		
	    //case-6
		System.out.println("case-6: ");
		a1 = a; // A a1 = new A()
		System.out.println("case 6 is same as case 1");		
	System.out.println("-------------------------------");
	
		//case-7
		System.out.println("case-7: Compilation Error");
		//B b = new A();--> Compilation Error(Cannot store parents class in child);
		//B b2 = new B();
		//b = b2;		
	System.out.println("-------------------------------");
	}
}
