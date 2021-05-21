/*Assignment - 23 : 18th April'2021
Write a program with different method to satisfy following requirement.
1) validate whether given number is prime or not.*/

package kajal.StringAndCharProgram;

public class Assignment23p1 {
	void getNumPrime(int targetNum) {

		boolean isprimeflag = true;
		for (int num = 2; num <= targetNum / 2; num++) {
			if (targetNum % num == 0) {
				isprimeflag = false;
				break;
			}
		}
		if (isprimeflag)
			System.out.println("Given number is prime = " + targetNum);
		else
			System.out.println("Given number is not prime = " + targetNum);
	}

	public static void main(String[] args) {
		Assignment23p1 primenum = new Assignment23p1();
		primenum.getNumPrime(13);
		primenum.getNumPrime(20);
	}

}
