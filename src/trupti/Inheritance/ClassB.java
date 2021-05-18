package trupti.Inheritance;

public class ClassB extends ClassA {
	
	int y=30;
	int z=40;
	
	void m2() {
		System.out.println("B class m2 method");
	}
	
	void m3() {
		System.out.println("B class m3 method");
	}

	public static void main(String[] args) {
	//CASE 2 :
		{
		ClassB b1=new ClassB();
		System.out.println("Case 2 :");
		System.out.println(b1.x);
		System.out.println(b1.y);
		System.out.println(b1.z);
		b1.m1();
		b1.m2();
		b1.m3();
	}
	//CASE 4:
		{
			/* ClassB b=new ClassA();  [Reason:We can't fit parent class "ClassA" into child class "ClassB" reference.This is not 
			 possible without type casting.It will throw a compile error on first line itself ]*/
		}
   //CASE 7 :
		{
			//ClassB b1=new ClassA();//[Reason-It will give compilation error because it's trying to fit parent to child]
			//ClassB b2 = new ClassB();
			//b1=b2;
		}
}

}
