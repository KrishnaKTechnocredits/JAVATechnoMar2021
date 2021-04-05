//Write a code based on the given figure, [create 4 classes and different methods as per given figure]. from the main method, you will call the m1 method of calls A as mentioned in the figure. From m1 method call m2 method of class B and so on. 
//You should write one print statement in every method like Inside First method or anything which can help you to understand which methods are being called in sequence. with acPR number please attach screenshot of output.

package prashant.Assignment_11;

public class Class_D {

	static void m6() {
		System.out.println("This is m6 Static method ,Call Static to Static in within Class");
		m7();
	}

	static void m7() {
		System.out.println("This is m7 Static method of Class D");
	}
}
