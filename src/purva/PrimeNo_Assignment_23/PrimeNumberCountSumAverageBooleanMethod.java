package purva.PrimeNo_Assignment_23;

public class PrimeNumberCountSumAverageBooleanMethod {
	
	/*
	 * 3) count all the prime numbers given range.
       input : 2 to 100
       4) sum of all the prime numbers given range.
       input : 2 to 100
       5) sum of all the prime numbers given range.
       input : 2 to 100
	 */
	int sum=0;
	int count =0;
	void NumberIfPrime(int startRange,int endRange) {
		
		
		for(;startRange<=endRange;startRange++) {
			boolean isPrimeFlag = true;
			for(int innerIndex=2;innerIndex <= startRange/2; innerIndex++) {
				if(startRange%innerIndex == 0) {
					isPrimeFlag = false;
				    
				}	
			}
			if(isPrimeFlag) {
				count++;
				sum = sum + startRange;    
			}
		 }
			
	}
		void getSumCountAvg() {
			
		System.out.println("Total prime number is "+count);
	    System.out.println("Sum of all prime number " +sum);
		int average = sum/count;
	    System.out.println("Average of all prime number is "+average);
	}
	
	public static void main(String[] a) {
		PrimeNumberCountSumAverageBooleanMethod primeNumberCountSumAverageBooleanMethod=new PrimeNumberCountSumAverageBooleanMethod();
		primeNumberCountSumAverageBooleanMethod.NumberIfPrime(2,100);
		primeNumberCountSumAverageBooleanMethod.getSumCountAvg();	
	}

}
