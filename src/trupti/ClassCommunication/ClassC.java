package trupti.ClassCommunication;

public class ClassC {

		void m4() {
			System.out.println("This is non-static m4 method of Class C.");
			m5();
		}
		
		void m5() {
			System.out.println("This is non-static m5 method of Class C.");
			ClassD.m6();
		}
		
}
