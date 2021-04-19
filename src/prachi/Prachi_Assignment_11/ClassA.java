package prachi.Prachi_Assignment_11;

/*Write a code based on the given figure, [create 4 classes and different methods as per given figure]. 
from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method
call m2 method of class B and so on. 

You should write one print statement in every method like Inside First method or anything which can help
you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.*/

public class ClassA {
	
	void m1() {
		System.out.println("This is method m1 from Class A");
		ClassB b1=new ClassB();
		b1.m2();		
	} 
	
	public static void main(String[] args) {
		ClassA a = new ClassA();
		a.m1();
	}
}
