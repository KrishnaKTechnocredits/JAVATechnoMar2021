package amrutaM.loopAssignments;

/*Create a class to satisfy below requirements.                    
a) Print Number is prime if Given number is prime. (parameterized method)
b) Print all the prime numbers between range 100->120. (parameterized method)
c) Print total count of prime numbers between 100->120.
d) Find sum of all prime numbers between 100->120
e) Find avg of prime numbers between 100->120
*/
public class Assignment10_PrimeNumber {
	int primeCount, sum, average;
	void isPrimeNumber(int number) {
		boolean isPrime = true;

		for (int index = 2; index <= number/2; index++) {
			if (number % index == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			primeCount++;
			System.out.println(number +" is prime number");
			sum +=number;
			average = sum/primeCount;	
		}
	}
	
	void printAllPrimeNumbersInRange(int startNum, int endNum) {
		
		for(int index =startNum;index<=endNum;index++) {
			isPrimeNumber(index);
		}
		System.out.println("Total prime numbers between the provided range is - "+primeCount);
		System.out.println("Sum of prime numbers between "+startNum+ " and "+endNum+ " is - "+sum);
		System.out.println("Average of prime numbers between "+startNum+ " and "+endNum+ " is - "+average);
	}

	public static void main(String[] args) {
		Assignment10_PrimeNumber assignment10_PrimeNumber = new Assignment10_PrimeNumber();
		//assignment10_PrimeNumber.isPrimeNumber(11);
		assignment10_PrimeNumber.printAllPrimeNumbersInRange(100, 120);
	}
}
