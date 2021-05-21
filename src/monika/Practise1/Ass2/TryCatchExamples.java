package monika.Practise1.Ass2;

public class TryCatchExamples {

	static void m() {
		System.out.println("Hi");
		try {
			System.out.println(10);
			int i = 9 / 0;
		} catch (ArithmeticException a) {
			System.out.println("Hndled");
		}
	}

	public static void main(String[] args) {
		m();
	}

}
