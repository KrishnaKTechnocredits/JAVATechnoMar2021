package technocredits.tricky;

public class PrimeNumber2 {
	
	void validateNumberIsPrime(int targetNum) {
		int count = 0;
		for(int num=2;num<=targetNum/2;num++) {
			if(targetNum % num == 0) {
				count = 1;
				break;
			}
		}
		if(count == 0)
			System.out.println("Given number " + targetNum + " is prime");
		else
			System.out.println("Given number " + targetNum + " is not prime");
		
	}
	
	public static void main(String[] args) {
		PrimeNumber2 primeNumber = new PrimeNumber2();
		primeNumber.validateNumberIsPrime(17);
		primeNumber.validateNumberIsPrime(9);
	}
	
	
	
}
