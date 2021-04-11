	package pravin.Assignment_11;
	
	public class B {
		void m2() {
			System.out.println("This is nonstatic method m2 in B class");
			B.m3();
		}
		static void m3() {
			System.out.println("This is static method m3 in B class");
			C c = new C();
			c.m4();
		}
	}
