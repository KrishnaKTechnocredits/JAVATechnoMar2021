package technocredits.tricky;

public class PrimeNumber4 {
	
	boolean validateNumberIsPrime(int targetNum) {
		boolean isPrimeflag = true;
		for(int num=2;num<=targetNum/2;num++) {
			if(targetNum % num == 0) {
				isPrimeflag = false;
				break;
			}
		}
		return isPrimeflag;
	}
	
	public static void main(String[] args) {
		PrimeNumber4 primeNumber = new PrimeNumber4();
		int targetNum = 17;
		boolean isPrimeflag = primeNumber.validateNumberIsPrime(targetNum);
		if(isPrimeflag == true)
			System.out.println("Given number " + targetNum + " is prime");
		else
			System.out.println("Given number " + targetNum + " is not prime");
		
		primeNumber.validateNumberIsPrime(9);
	}
	
	
	
}
