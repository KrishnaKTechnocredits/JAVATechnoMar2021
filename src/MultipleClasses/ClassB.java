package MultipleClasses;

public class ClassB {
	
	public void m2() {
		System.out.println("I am in m2 of class B");
		Classc c=new Classc();
		//example for static method
		Classc.m();
		//object.methodname for non static method
		c.m3();
		
		
	}

}
