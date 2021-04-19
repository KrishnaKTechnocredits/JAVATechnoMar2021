package monali.Assignment_23;

public class CountPrimeNum {

	void countPrimeNum(int startrange, int endrange) {
		int count = 0;
		for (int index = startrange; index <= endrange; index++) {
			int targetnum = index;
			boolean flag = true;

			for (int num = 2; num <= targetnum / 2; num++) {
				if (index % num == 0)
					flag = false;

				break;
			}
			if (flag == true) {
				count++;

				System.out.println(index + " is prime number");
			}

		}
		System.out.println("total prime number in given range is " + count);
	}

	public static void main(String[] args) {
		CountPrimeNum printall = new CountPrimeNum();
		printall.countPrimeNum(2, 100);
	}
}
