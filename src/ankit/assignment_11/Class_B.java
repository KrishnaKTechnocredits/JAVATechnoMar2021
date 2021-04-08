package ankit.assignment_11;

public class Class_B {
	
	void methodM2() {
		System.out.println("You Printed this statement from Class B method M2(Non-Static)");
		/*
		 * Here we need to call methodM3 which is static and in same class i.e. Class_B, 
		but we never create object of static class so we can call it directly or with class name
		As whenever Class_B object created its static methods/variable will automatically allocated to memory  
		
		methodM3(); // This will also work but it is not best practice so commented 
		 */
		Class_B.methodM3();
	}
	static void methodM3() {
		
		System.out.println("You Printed this statement from Class B method M3(Static)");
		/*Here we need to call Method M4 from class C and it is non static,
		 * caller method is static and called method is non static
		 * So only option is to create an object and call its method
		*/
		Class_C cC = new Class_C();
		cC.methodM4();
	}
}
