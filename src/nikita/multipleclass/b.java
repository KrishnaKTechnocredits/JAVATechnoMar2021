package nikita.multipleclass;

public class b {

		void m2() {
			System.out.println("Hello world: ");
			b.m3();
		}
		
		static void m3() {
			System.out.println("Hello world Nikita: ");
			c c1= new c();
			c1.m4();
		}
}
