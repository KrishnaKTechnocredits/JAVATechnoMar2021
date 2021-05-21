package surabhi.assignment27;

public class Child extends Parent {
	int a=50;
	int c=90;
	void m1() {
		System.out.println("Child M1");
	}
	
	void m2() {
		System.out.println("Child m2");
	}
	
	public static void main(String[] args) {
		Parent parent=new Parent();
		System.out.println(parent.a); 
		System.out.println(parent.b); 
		parent.m1();
			
		Child child1=new Child();
		System.out.println(child1.a); 
		System.out.println(child1.b); 
		System.out.println(child1.c); 
		child1.m1();
		child1.m2();
	
		Parent child2=new Child();
		System.out.println(child2.a); 
		System.out.println(child2.b); 
		//System.out.println(child2.c); ->Compilation Error
		child2.m1(); 
		//child2.m2();  ->Compilation Error
	}
}
