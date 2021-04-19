package pavan.Assignment23;

public class PrimeNo40to100 {

	void getmultipleprime(int range) {

		for (int index = 40; index <= range; index++) {
			int target = index;
			int count = 0;
			for (int num = 2; num <= target / 2; num++) {
				if (target % num == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0)
				System.out.println("Given number " + target + " is prime number");
			else
				System.out.println("Given number " + target + " is not  prime number");
		}
	}

	public static void main(String[] args) {
		PrimeNo40to100 a = new PrimeNo40to100();
		a.getmultipleprime(100);
	}

}
