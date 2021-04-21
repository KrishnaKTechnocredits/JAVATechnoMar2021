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
package radha.PrimeNumbers.Assignment23;

public class PrimeNumRange {

	void booleanNoIsPrime(int targetNo) {
		boolean flag = true;
		for (int num = 2; num <= targetNo/2; num++) {
			if (targetNo % num == 0) {
				flag = false;
				break;
			}
		}
		if (flag ==true)
			System.out.println(targetNo + " is prime.");
		else
			System.out.println(targetNo + " is not prime.");
	}
	
	void primeRange(int startRange, int endRange) {
		System.out.println("\n*****All prime number between "+startRange+" & "+endRange+" *****");
		for (int targetNo = startRange; targetNo <= endRange; targetNo++) {
			boolean flag = true;
			for (int num = 2; num <= targetNo / 2; num++) {
				if (targetNo % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) { 
				System.out.println(targetNo + " is prime.");
			}
		}
	}
	
	void countOfPrimeNumbers(int startRange, int endRange) {
		int count = 0, sum =0;
		System.out.println("\n*****All prime number between "+startRange+" & "+endRange+" *****");
		for (int targetNo = startRange; targetNo <= endRange; targetNo++) {
			boolean flag = true;
			for (int num = 2; num <= targetNo / 2; num++) {
				if (targetNo % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				count++;
				sum+=targetNo;
			}
		}
		System.out.println("Count of prime no is "+count);
		System.out.println("Sum of prime numbers is "+sum);
		System.out.println("Average of sum of prime numbers between "+startRange+" & "+endRange+" is "+(sum/count));
	}
	
	public static void main(String[] args) {
		PrimeNumRange prime = new PrimeNumRange();
		prime.booleanNoIsPrime(13);
		prime.primeRange(40, 100);
		prime.countOfPrimeNumbers(2, 100);
	}
}
