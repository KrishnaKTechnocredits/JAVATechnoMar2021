package ankit.assignment_11;

public class Class_D {
	
	static void methodM6() {
		System.out.println("You Printed this statement from Class D method M6(Static)");
		/* 
		 Here we need to call static method M7 from caller method M6, but as both caller and called method are static
		 then even direct mentioning of method name like : methodM7(); will work but it is not best practice 
		 Better to mention with class name 
		 */
		Class_D.methodM7();
	}
	static void methodM7() {
		
		System.out.println("You Printed this statement from Class D method M7(Static)");
		
	}
}
