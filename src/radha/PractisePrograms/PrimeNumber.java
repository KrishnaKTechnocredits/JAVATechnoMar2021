package radha.PractisePrograms;

public class PrimeNumber {

	void validateNoIsPrime(int targetNo) {
		int num = 2;
		for (; num <= targetNo/2; num++) {
			if (targetNo % num == 0) {
				break;
			}
		}
		if ((targetNo/2)+1 == num)
			System.out.println(targetNo + " is prime.");
		else
			System.out.println(targetNo + " is not prime.");
	}
	
	void booleanNoIsPrime(int targetNo) {
		boolean flag = true;
		for (int num = 2; num <= targetNo/2; num++) {
			if (targetNo % num == 0) {
				flag = false;
				break;
			}
		}
		if (flag ==true)
			System.out.println(targetNo + " is prime.");
		/*else
			System.out.println(targetNo + " is not prime.");*/
	}
	
	void validateAllPrimeNo(int target) {
		for(int number=2; number < target; number++) {
			booleanNoIsPrime(number);
		}
	}
	
	void primeRange(int range) {
		for (int index = 2; index <= range; index++) {
			int targetNo = index;
			boolean flag = true;
			for (int num = 2; num <= targetNo / 2; num++) {
				if (targetNo % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true)
				System.out.println(targetNo + " is prime.");
			/*
			 * else System.out.println(targetNo + " is not prime.");
			 */
		}
	}
	
	void sumPrimeRange(int startRange, int endRange) {
		int count = 0, sum =0;
		for (int targetNo = startRange; targetNo <= endRange; targetNo++) {
			boolean flag = true;
			for (int num = 2; num <= targetNo / 2; num++) {
				if (targetNo % num == 0) {
					flag = false;
					break;
				}
			}
			if (flag == true) {
				System.out.println(targetNo + " is prime.");
				count++;
				sum+=targetNo;
			}
		}
		System.out.println("Counnt of prime no is "+count);
		System.out.println("Sum of prime numbers is "+sum);
		System.out.println("Average of sum of prime numbers between "+startRange+" & "+endRange+" is "+(sum/count));
	}
	
	void stringNoIsPrime(int targetNo) {
		String isPrime= "Yes";
		for (int num = 2; num <= targetNo/2; num++) {
			if (targetNo % num == 0) {
				isPrime = "No";
				break;
			}
		}
		if (isPrime.equals("Yes"))
			System.out.println(targetNo + " is prime.");
		else
			System.out.println(targetNo + " is not prime.");
	}

	public static void main(String[] args) {
		PrimeNumber prime = new PrimeNumber();
		//prime.validateNoIsPrime(4);
		//prime.validateNoIsPrime(9);
		//prime.booleanNoIsPrime(11);
		//prime.stringNoIsPrime(19);
		//prime.validateAllPrimeNo(20);
		//prime.primeRange(20);
		prime.sumPrimeRange(5, 20);
	}
}
