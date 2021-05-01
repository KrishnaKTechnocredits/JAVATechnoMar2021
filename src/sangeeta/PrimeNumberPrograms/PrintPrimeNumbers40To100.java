/*print all the prime numbers given range.
   input : 40 to 100
   output :*/ 

package sangeeta.PrimeNumberPrograms;

public class PrintPrimeNumbers40To100 {
	
	void primenumbersbtwn40to100() {
		for(int num = 40; num<=100; num++ ) {
			IsPrimeNumber isPrimeNumber = new IsPrimeNumber();//Created object to call isPrime method from class IsPrimeNumber
			isPrimeNumber.isPrime(num);
		}
	}
	
	public static void main(String[] a) {
		PrintPrimeNumbers40To100 printPrimeNumbers40To100 = new PrintPrimeNumbers40To100();
		printPrimeNumbers40To100.primenumbersbtwn40to100();
	}
}
