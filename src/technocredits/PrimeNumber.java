package technocredits;
public class PrimeNumber{

	void primeNum(int start) {
		boolean isPrime=true;
		//int count = 0;
		for (int index = 2; index < start; index++) {
			if (start % index == 0) {
				isPrime = false;
				//count = 1;
				break;
			}
		}
		if (isPrime) 
			System.out.println(start+" Number Is Prime"  );
		
	}

	void validatePrime(int start,int end){
		for(int index=start;index<end;index++) {
			primeNum(index);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		//primeNumber.primeNum(33);
		primeNumber.validatePrime(40,100);
	}
}
