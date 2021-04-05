package mayur.CommunicationBetweenClasses;

public class ClassA {
	
		void m1() {
			System.out.println("This is Static m1 method of Class A");
			ClassB classb =new ClassB();
			classb.m2();

		}

		public static void main(String[] args) {
			ClassA a = new ClassA();
			a.m1();
		}

	}


