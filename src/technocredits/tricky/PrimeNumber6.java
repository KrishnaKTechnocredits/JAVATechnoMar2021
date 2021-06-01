package technocredits.tricky;

public class PrimeNumber6 {
	
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
	
	void validateAllPrimeNum(int targetNum) {
		for(int num = 2; num <=targetNum; num++) {
			validateNumberIsPrime(num);
		}
	}
	
	public static void main(String[] args) {
		PrimeNumber6 primeNumber = new PrimeNumber6();
		primeNumber.validateAllPrimeNum(20);
	}
	
	
	
}
