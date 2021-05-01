//5) Average of all the prime numbers given range.
//input : 2 to 100
//output :

package kajal.StringAndCharProgram;

public class Assignment23p5 {
	double count = 0;
	int sum = 0;

	void getPrimeNum5(int startNum, int endNum) {

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
			if (isprimeflag)
				count++;
		}
		System.out.println("Average of prime number = " + (sum / count));
	}

	public static void main(String[] args) {
		Assignment23p5 primenumber5 = new Assignment23p5();
		primenumber5.getPrimeNum5(2, 100);
	}
}