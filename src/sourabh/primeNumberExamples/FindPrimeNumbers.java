/*Write a program with different method to satisfy following requirement. 
1) validate whether given number is prime or not.
2) print all the prime numbers given range.
   input : 40 to 100
   output : 
3) count all the prime numbers given range.
   input : 2 to 100
   output : 
4) sum of all the prime numbers given range.
   input : 2 to 100
   output : 
5) Average of all the prime numbers given range.
   input : 2 to 100
   output : */

package sourabh.primeNumberExamples;

public class FindPrimeNumbers {
//----------------------------------------validate whether given number is prime or not----------------	
	void getPrimeNumbers(int targetNumber) {
		boolean isPrimeFlag= true;
		for(int number=2; number<=targetNumber/2; number++) {
			if(targetNumber%number== 0) {
				isPrimeFlag= false;
				break;
			}	
		}
		if(isPrimeFlag) {
			System.out.println("Prime:"+targetNumber);
		}
		else
			System.out.println("Not Prime:"+targetNumber);
	}

//-----------------------------print all the prime numbers given range-------------------------------------	
	 void getAllPrimeNumbersFrom40to100(int startRange, int endRange) {
		  System.out.println("print all the prime numbers given range:");
		  for(;startRange<=endRange;startRange++) { 
			  getPrimeNumbers(startRange); 
		  }
	  }
//----------------------------------Count---------------------------------------
	 
	int getCountOfPrimeNumbersFrom2to100(int startRange, int endRange) {
		int primeCount=0;		
		for(;startRange<=endRange;startRange++) {			
			int targetnum= startRange;
			boolean isPrimeFlag= true;
				for(int num=2;num<=targetnum/2;num++) {
					if(targetnum%num==0) {
						isPrimeFlag= false;
					}								
				}
				if(isPrimeFlag) {
					//System.out.println("Prime :"+targetnum);
					primeCount++;
				}		 
		}
		//System.out.println("Prime Count:"+primeCount);	
		return primeCount;
	}
//-----------------------------------------------------------
/*	  void getAllPrimeNumbersFrom2to100(int startRange, int endRange) {
		  for(;startRange<=endRange;startRange++) { 
			  getPrimeNumbers(startRange);			  
		  }
	  } 
*/
//----------------------------SUM--------------------------------------
	int getSumOfNumbersFrom2to100(int startRange, int endRange) {
		int primeSum=0;		
		for(;startRange<=endRange;startRange++) {			
			int targetnum= startRange;
			boolean isPrimeFlag= true;
				for(int num=2;num<=targetnum/2;num++) {
					if(targetnum%num==0) {
						isPrimeFlag= false;
					}								
				}
				if(isPrimeFlag) {
					//System.out.println("Prime :"+targetnum);
					primeSum=primeSum+targetnum;
				}		 
		}
		//System.out.println("Prime:"+targetnum);	
		return primeSum;
	}	
	
//----------------------------Average--------------------------------------	
	
	double getAverageOfNumbersFrom2to100(int primeSum, int primeCount) {
		double primeAvg=primeSum/primeCount;
		return primeAvg;
		
	}
//---------------------------------Main-------------------------------------------	
	public static void main(String[] args) {
		FindPrimeNumbers findPrimeNumbers= new FindPrimeNumbers();
		findPrimeNumbers.getPrimeNumbers(17);
		findPrimeNumbers.getPrimeNumbers(93);
		findPrimeNumbers.getAllPrimeNumbersFrom40to100(40, 100);
		int primeCount= findPrimeNumbers.getCountOfPrimeNumbersFrom2to100(2,100);
		System.out.println("Count all the prime numbers given range: "+primeCount);
		int primeSum= findPrimeNumbers.getSumOfNumbersFrom2to100(2, 100);
		System.out.println("Count all the prime numbers given range: "+primeSum);
		double primeAvg= findPrimeNumbers.getAverageOfNumbersFrom2to100(primeSum, primeCount);
		System.out.println("Count all the prime numbers given range: "+primeAvg);		
	}

}
