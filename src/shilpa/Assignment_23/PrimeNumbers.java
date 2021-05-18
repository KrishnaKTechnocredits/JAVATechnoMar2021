/*Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output :*/

package shilpa.Assignment_23;

public class PrimeNumbers {
	int cntPrimeNo = 0;
	int sumOfPrimeNo = 0;

	int validateGivenPrimeNo(int num) {
		int cnt = 0;
		for (int index = 2; index < num; index++) {
			if (num % index == 0)
				cnt++;
		}
		if (cnt == 0)
			return num;
		else
			return 0;
	}

	void printPrimeNosInGivenRange(int startRange, int endRange) {
		System.out.println("Prime Numbers in a Given Range " + startRange + " To " + endRange + " are");
		for (int index = startRange; index <= endRange; index++) {
			int primeNo = validateGivenPrimeNo(index);
			if (primeNo != 0) {
				System.out.println(primeNo);
			}

		}

	}

	void getCountPrimeNos(int startRange, int endRange) {
		for (int index = startRange; index <= endRange; index++) {
			int primeNo = validateGivenPrimeNo(index);
			if (primeNo != 0) {
				cntPrimeNo++;
				sumOfPrimeNo = sumOfPrimeNo + primeNo;
			}
		}
		System.out.println(
				"Count of all prime numbers in a range " + startRange + " To " + endRange + " is:- " + cntPrimeNo);
	}

	void getSumOfPrimeNos() {
		System.out.println("Sum of Prime Numbers in a given range is:- " + sumOfPrimeNo);
	}

	void getAverageOfPrimeNos() {
		int average = 0;
		average = sumOfPrimeNo / cntPrimeNo;
		System.out.println("Average of Prime Numbers in a given range is:- " + average);
	}

	public static void main(String[] args) {
		PrimeNumbers primeNumbers = new PrimeNumbers();
		primeNumbers.printPrimeNosInGivenRange(40, 100);
		primeNumbers.getCountPrimeNos(2, 100);
		primeNumbers.getSumOfPrimeNos();
		primeNumbers.getAverageOfPrimeNos();
	}

}
