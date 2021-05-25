package sai.coding_exam8;

public class Fibonaci {

	void fibonaciSeries() {
		int a = 0;
		int b = 1;
		int c = 0;

		System.out.println(a);
		System.out.println(b);
		for (int num = 2; num < 8; num++) {
			c = a + b;
			System.out.println(c);
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {
		Fibonaci fibonaci = new Fibonaci();
		fibonaci.fibonaciSeries();

	}

}
