package purva.Assignment_25;

public class FirstFivePrimeNumber {
	
	boolean validatePrime(int targetValue) {
		
		boolean isPrime = true;
		for (int num = 2; num <= targetValue / 2; num++) {
			if (targetValue % num == 0) {
				isPrime = false;
				break;
			}
		}
			return isPrime;
	}
	
	void primeNumber(int startRange, int endRange) {
		int count = 0;
		for(int num= startRange;num<=endRange;num++) {
			boolean isPrime = validatePrime(num);
			if (isPrime) {
				count++;
				System.out.print(num+" ");
				if(count == 5)
					break;
			}
		}
	}
	
	
	public static void main(String[] a) {
		FirstFivePrimeNumber firstFive = new FirstFivePrimeNumber();
		System.out.println("first five prime numbers are : ");
		firstFive.primeNumber(10,50);
	}
		

}
