//Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 
//You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.

package prashant.Assignment_11;

public class Class_C {

	void m4() {
		System.out.println("This is m4 Non Static Method, Call Non Static to Non Static in same Class C");
		m5();
	}

	void m5() {
		System.out.println("This is m5 non static method, Call static into Non Static of Class D");
		Class_D.m6();
	}
}
