package monali.Assignment_27_ParentAndChildInheritance;

public class Client {

	public static void main(String[] args) {
		/// case 1 :
		Parent parent = new Parent();
		System.out.println(parent.A);
		System.out.println(parent.Y);
		//System.out.println(parent.B); [reason:class parent does not have variable B]
		parent.m1();
		parent.m2();
		//parent.m3();[reason:method m3 is not present in class parent]
		
		///case 2 :
		Child child = new Child();
		System.out.println(child.B);
		System.out.println(child.A);
		System.out.println(child.Y);
		child.m1();
		child.m2();
		child.m3();
		
		///case 3 :
		Parent parent1 = new Child();
		System.out.println(parent1.A);
		System.out.println(parent1.Y);
		//System.out.println(parent1.B); [reason : As compiler always check left hand side and in left hand only the parent class is define,so only the parent class variables and method can be access.]
		parent1.m1();
		parent1.m2();
		//parent.m3(); [reason : same reason as line no.28]

		///case 4 :
		//Child child1 = new Parent(); [reason : we are trying to assign the parent class object into child class reference which is not allowed without external type casting.]
		
		///case 5 :
		Parent parent2 = new Parent();
		Child child2 = new Child();
		parent2 = child2;
		System.out.println(parent.A);
		//System.out.println(parent.B);[reason : As it is an example of dynamic polymorphism in which at the compile time parent class guaranty is must and only parant class variable and methods can be access.]
		System.out.println(parent.Y);
		parent2.m1();
		parent2.m2();
		//parent.m3();[reason : same as line no.41]
		
		///case 6 :
		Parent parent3 = new Parent();
		Child child3 = new Child();
		parent3 = child3;
		
		///case 7 :
		//Child child4 = new Parent();[reason : can not assign parent to child.]
		Child child5 = new Child();
		//child5 = child4;


	}
}
