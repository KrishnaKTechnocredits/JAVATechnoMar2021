package ankit.assignment_23;


public class PrimeNumber {
	static int primeCount;

	boolean validatePrimeNum(int num) {
		int count = 0;
		for(int index = 2 ; index <= num/2 ;index++) {
			if(num % index == 0) {
				count = 1;
				break;
			}
		}
		if (count == 0 ) {
			primeCount++;
			return true;
		}else{
			return false;
		}
	}

	int[] primeNumberInRange(int startNum, int endNum) {
		int[] primeArr = new int[(endNum-startNum)/2];
		int newArrCount = 0;
		for(int index = startNum ; index < endNum; index++) {
			boolean isPrime = validatePrimeNum(index);
			if(isPrime) {
				primeArr[newArrCount] = index;
				newArrCount++;
			} 
		}
		return primeArr;
	}
	int sumOFPrimeNumbers(int[] primeNumArr) {
		int sum = 0;
		for( int index = 0; index < primeNumArr.length ; index++) {
			sum = sum + primeNumArr[index];
		}return sum;
	}

	void countAllPrimeInRange() {
		System.out.println("count of Prime Numbers :"+ primeCount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrimeNumber pNumFinding = new PrimeNumber();
		boolean primeFlag = pNumFinding.validatePrimeNum(5);
		if(primeFlag) {
			System.out.println("Number is prime ");
		}else {
			System.out.println("Number is not prime");
		}
		System.out.println("________________");
		int[] primeNumArr = pNumFinding.primeNumberInRange(1, 50);
		for( int index = 0 ; index < primeNumArr.length; index++) {
			if(primeNumArr[index] != 0) {
				System.out.println(primeNumArr[index]);
			}
		}
		pNumFinding.countAllPrimeInRange();
		System.out.println("Sum of All Prime Numbers is "+ pNumFinding.sumOFPrimeNumbers(primeNumArr));
		System.out.println("Avaerage of all Prime Numbers is "+pNumFinding.sumOFPrimeNumbers(primeNumArr)/primeCount);	
	}
}
/*
Prime number : 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 25
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output : 
 */