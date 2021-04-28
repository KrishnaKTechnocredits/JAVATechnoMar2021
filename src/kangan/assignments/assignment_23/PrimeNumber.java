package kangan.assignments.assignment_23;

/*validate whether given number is prime or not.*/

public class PrimeNumber {

	void validatePrimeNumber(int targetNum) {
		boolean flag = true;
		for(int num = 2; num<=targetNum/2;num++) {
			if(targetNum%num==0) {
				flag = false;
				break;
			}
		}
		if(flag==true)
			System.out.println(targetNum + " is Prime");
		else
			System.out.println(targetNum + " is Not prime");
	
	}
	public static void main(String[] args) {
		PrimeNumber primeNumber = new PrimeNumber();
		primeNumber.validatePrimeNumber(117);
	}
}
