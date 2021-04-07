package ankit.assignment_11;

public class Class_C {
	
	void methodM4() {
		System.out.println("You Printed this statement from Class C method M4(Non-Static)");
		/*
		 Here we need to call M5 method which is non static from M4 which is non static
		 So it is mandate that whenever M4 comes in memory then M5 will also get allocation in heap
		 So we can directly call as both caller and called method are in same class
		 */
		methodM5();
	}
	void methodM5() {
		
		System.out.println("You Printed this statement from Class C method M5(Non-Static)");
		/*
		Here we need to call static method of Class_D which is static
		caller method is non static, so we can call directly by using class name 
		Reason is whenever we mention class its static variable/methods get memory allocation in heap
	 	so object creation is not required.
		*/
		Class_D.methodM6();
		
	}
}
