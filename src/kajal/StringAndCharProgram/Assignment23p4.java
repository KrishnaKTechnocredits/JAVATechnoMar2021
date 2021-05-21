//4) sum of all the prime numbers given range.
//input : 2 to 100
//output :

package kajal.StringAndCharProgram;

public class Assignment23p4 {

	int sum = 0;

	void getPrimeNum4(int startNum, int endNum) {

		for (int startnum = 2; startnum <= endNum; startnum++) {
			boolean isprimeflag = true;
			for (int num = 2; num <= startnum / 2; num++) {
				if (startnum % num == 0) {
					isprimeflag = false;
					break;
				}
			}
			if (isprimeflag)
				sum = sum + startnum;
		}
		System.out.println("Total sum of prime number = " + sum);
	}

	public static void main(String[] args) {
		Assignment23p4 primenum4 = new Assignment23p4();
		primenum4.getPrimeNum4(2, 100);
	}
}