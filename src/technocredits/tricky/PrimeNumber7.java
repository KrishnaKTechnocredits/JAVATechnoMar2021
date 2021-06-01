package technocredits.tricky;

public class PrimeNumber7 {
	
	int sum = 0;
	int count = 0;
	
	void validateNumberIsPrime(int range) {
		int[] allPrimeNum = new int[range/2+1];
		
		for(int targetNum = 2; targetNum <= targetNum; targetNum++) {
			
			boolean isPrimeflag = true;
			for(int num=2;num<=targetNum/2;num++) {
				if(targetNum % num == 0) {
					isPrimeflag = false;
					break;
				}
			}
			if(isPrimeflag == true) {
				System.out.println("Given number " + targetNum + " is prime");
				sum = sum + targetNum;
				allPrimeNum[count] = targetNum;
				count++;
			}else
				System.out.println("Given number " + targetNum + " is not prime");
		}
	}
	
	void calculateAverageOfPrimeNumbers() {
		System.out.println();
	}
	public static void main(String[] args) {
		PrimeNumber7 primeNumber = new PrimeNumber7();
		primeNumber.validateNumberIsPrime(20);
		
	}
	
	
	
}
