package trupti.Inheritance;

public class ClassA {
	int x=10;
	int y=12;

	void m1() {
		System.out.println("A class m1 method");
	}

	void m2() {
		System.out.println("A class m2 method");
	}

	public static void main(String[] args) {
		//CASE 1:
		{
			ClassA a1=new ClassA ();
			System.out.println("Case 1 :");
			System.out.println(a1.x);
			System.out.println(a1.y);
			//System.out.println(a1.z); [Reason-Z variable present in Child classB which can not be access by parent ClassA.]
			a1.m1();
			a1.m2();
			//a1.m3();[Reason:-m3 method present in Child classB which can not be access by parent ClassA.]
		}

		//CASE 3:
		{
			ClassA a1=new ClassB();
			System.out.println("Case 3 :");
			System.out.println(a1.x);
			System.out.println(a1.y);//[Value for y variable can be used from parent ClassA as properties can not changes from compile to runtime.]
			//System.out.println(a1.z); [Reason-Z variable present in Child classB which can not be access by parent ClassA.]
			a1.m1();
			a1.m2();
			/*for m2()-It will execute m2() from child class.Because when parent and child class is having same method signature then it changes 
			 * from compile time to runtime.This behavior is called as Dynamic Polymorphism. */
			//a1.m3();[Reason:-m3 method present in Child classB which can not be access by parent ClassA.]
		}

		//CASE 5 :
		{
			ClassA a1=new ClassA();
			ClassB b1=new ClassB();
			a1=b1;
			System.out.println("Case 5:");
			System.out.println(a1.x);
			System.out.println(a1.y);
			//System.out.println(a1.z);[Reason-Z variable present in Child classB which can not be access by parent ClassA.]
			a1.m1();
			a1.m2();
			/*for m2()-It will execute m2() from child class.Because when parent and child class is having same method signature then it changes from
			 compile time to runtime.This behavior is called as Dynamic Polymorphism. */
			//a1.m3();[Reason:-m3 method present in Child classB which can not be access by parent ClassA.]

		}
		//CASE 6 :
		{
			ClassA a1=new ClassA();
			ClassA b1=new ClassB();
			b1=a1; //equivalent to CASE 1 : ClassA b1 =new ClassA();
			System.out.println("Case 6:");
			System.out.println(a1.x);
			System.out.println(a1.y);
			//System.out.println(a1.z); [Reason-Z variable present in Child classB which can not be access by parent ClassA.]
			a1.m1();
			a1.m2();
			//a1.m3();[Reason:-m3 method present in Child classB which can not be access by parent ClassA.]
		}
	}

}
