/*Assignment - 23 : 18th April'2021

Write a program with different method to satisfy following requirement. 
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
   output :
*/

package upasana.assignment_23;

public class PrimeNo {

	int count;

	boolean prime(int target) {
		boolean flag = true;
		for (int num = 2; num <= target / 2; num++) {

			if (target % num == 0) {
				flag = false;
				break;
			}
		}
		return flag;
	}

	void printPrimeRange(int sIndex, int eIndex) {
		for (int target1 = sIndex; target1 <= eIndex; target1++) {
			boolean flag = prime(target1);
			if (flag) {
				System.out.println("Given number " + target1 + " in the range " + sIndex + " to " + eIndex + " is prime ");
			}
		}
	}

	void countPrimeRange(int sIndex, int eIndex) {
		for (int target1 = sIndex; target1 <= eIndex; target1++) {
			boolean flag = prime(target1);
			if (flag) {
				count++;

			}
		}
		System.out.println("");
		System.out.println("Total count of prime numbers in the range " + sIndex + " to " + eIndex + " is " + count);
	}
	
	int sumPrimeRange(int sIndex, int eIndex) {
		int sum=0;
		for (int target1 = sIndex; target1 <= eIndex; target1++) {
			boolean flag = prime(target1);
			if (flag) {
				sum=sum + target1;

			}
		}
		
		return sum;
	}
	
	
	void avgPrimeRange(int sIndex, int eIndex) {
		int avg=0;
		int sum=sumPrimeRange(sIndex, eIndex);
		avg=sum/count;
		System.out.println("");
		System.out.println("Average of prime numbers in the range " + sIndex + " to " + eIndex + " is " +avg);
	}

	public static void main(String[] args) {
		PrimeNo primeNo = new PrimeNo();
		boolean flag = primeNo.prime(17);
		if (flag) {
			System.out.println("");
			System.out.println("Given number 17 is prime ");
			System.out.println("");
		}
		primeNo.printPrimeRange(40, 100);
		primeNo.countPrimeRange(2, 100);
		int sum=primeNo.sumPrimeRange(2, 100);
		System.out.println("");
		System.out.println("Total sum of prime numbers in the range 2 to 100 is " +sum);
		primeNo.avgPrimeRange(2, 100);

	}
}
