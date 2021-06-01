package monali.Assignment_23;

public class PrintAllPrimeNum {

	void validatePrimeNum(int startrange, int endrange) {
		for (int index = startrange; index <= endrange; index++) {
			int targetnum = index;
			boolean flag = true;
			for (int num = 2; num <= targetnum / 2; num++) {
				if (targetnum % num == 0)
					flag = false;
				break;
			}
			if (flag == true)
				System.out.println("given number " + targetnum + " is prime");
			else
				System.out.println("given number " + targetnum + " is not prime");

		}
	}

	public static void main(String[] args) {
		PrintAllPrimeNum printall = new PrintAllPrimeNum();
		printall.validatePrimeNum(40, 100);
	}
}
