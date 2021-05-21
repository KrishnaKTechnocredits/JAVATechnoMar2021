package monali.coding_exam_8_30mins;


public class FibinacciSeries {

	static int num1 = 0;
	static int num2 = 1;
	static int num3 = 0;

	static void fibina(int count) {

		if (count > 0) {
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
			System.out.println("" + num3);
			fibina(count - 1);
		}

	}

	public static void main(String[] args) {
		FibinacciSeries num = new FibinacciSeries();
		int count = 8;
		System.out.println(num1 + "" + num2);
		fibina(count - 2);
	}

}
