package technocredits.tricky;

public class PrimeNumber5 {
	
	void validateNumberIsPrime(int targetNum) {
		String isPrime = "Yes";
		for(int num=2;num<=targetNum/2;num++) {
			if(targetNum % num == 0) {
				isPrime = "No";
				break;
			}
		}
		if(isPrime.equals("Yes"))
			System.out.println("Given number " + targetNum + " is prime");
		else
			System.out.println("Given number " + targetNum + " is not prime");
		
	}
	
	public static void main(String[] args) {
		PrimeNumber5 primeNumber = new PrimeNumber5();
		primeNumber.validateNumberIsPrime(17);
		primeNumber.validateNumberIsPrime(9);
	}
	
	
	
}
