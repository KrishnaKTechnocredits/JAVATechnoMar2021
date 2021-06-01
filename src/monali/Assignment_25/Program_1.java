package monali.Assignment_25;


public class Program_1 {

	void getFirstPrimeNum(int targetnum) {
		int[] output = new int[5];
		int i = 2;
		for (; i < targetnum; i++) {
			if (targetnum % i == 0)
				break;
		}
		if (targetnum == i)
			System.out.println(targetnum);
	}

	void getFirst5Prime(int startrange, int endrange) {
		for (int index = startrange; index < endrange; index++) {
			int num = index;
			getFirstPrimeNum(num);
		}
	}

	public static void main(String[] args) {
		new Program_1().getFirst5Prime(20, 50);
	}

}