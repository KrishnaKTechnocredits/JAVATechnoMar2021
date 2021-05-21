//validate whether given number is prime or not.

package krati_Shukla.Assignment23;

public class NumberIsPrime {

	void IsPrime(int targetNum) {
		boolean primeFlag = true;
		
		for(int i=2; i<targetNum/2 ; i++) {
			if(targetNum%i == 0) {
				primeFlag = false;
				break;
			}
		}
		if (primeFlag)
			System.out.println("Number "+targetNum+" is prime");
		else
			System.out.println("Number "+targetNum+" is not prime");
	}
	
	public static void main(String[] a) {
		NumberIsPrime numberIsPrime = new NumberIsPrime();
		numberIsPrime.IsPrime(13);
		
	}
}
