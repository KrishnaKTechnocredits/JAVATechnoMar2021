package madhavi_Khasbage.AraryPrimeNumbers;

public class AvgOfPrimeNum {
	
	int sumPrime = 0,cnt=0,avgNum=0;	
	void sumOfPrimeNum(int startRange, int endRange) {		
		for (int index = startRange; index < endRange; index++) {
			if (validatePrimeNum(index)) {
				sumPrime += index;
				cnt++;
			}			
		}				
	}	
	
	void avgOfPrimeNum() {
		avgNum=sumPrime/cnt;		
	}

	boolean validatePrimeNum(int num) {
		boolean isPrime = true;
		if (num == 0 || num == 1) {
			isPrime = false;
		} else {
			for (int index = 2; index < num; index++) {
				if (num % index == 0) {
					isPrime = false;
				}
			}
		}
		return isPrime;
	}

	public static void main(String[] args) {
		AvgOfPrimeNum avgPrime = new AvgOfPrimeNum();
		avgPrime.sumOfPrimeNum(2, 100);
		avgPrime.avgOfPrimeNum();
		System.out.println("Average of prime numbers between 2 and 100 is:" + avgPrime.avgNum);
	}
}
