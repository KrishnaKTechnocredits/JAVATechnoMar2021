package technocredits.tricky;

public class PrimeNumber3 {
	
	void validateNumberIsPrime(int targetNum) {
		boolean isPrimeflag = true;
		for(int num=2;num<=targetNum/2;num++) {
			if(targetNum % num == 0) {
				isPrimeflag = false;
				break;
			}
		}
		if(isPrimeflag == true)
			System.out.println("Given number " + targetNum + " is prime");
		else
			System.out.println("Given number " + targetNum + " is not prime");
		
	}
	
	public static void main(String[] args) {
		PrimeNumber3 primeNumber = new PrimeNumber3();
		primeNumber.validateNumberIsPrime(17);
		primeNumber.validateNumberIsPrime(9);
	}
	
	
	
}
