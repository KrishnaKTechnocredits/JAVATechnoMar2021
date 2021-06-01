package bhavana_assignment_23;
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

public class PrimeNumber {
	
	int primeCount;
	int sum;
	void primeNumber(int targetNo) {
		int count=0;
		
		for(int num=2;num<=targetNo/2;num++) {
			if(targetNo%num==0) {
				count=1;
				
				//break;
			}	
		}
		if(count==0) {
			System.out.println(targetNo+" Number is prime");
			
		}else {
			System.out.println(targetNo+" Number is not prime");
		}
	
	}
	
	void primeNumbersInGivenRange(int targetNum) {
		for(int num=40;num<=targetNum;num++) {
			primeNumber(num);
		}
	}
	
	void countOfPrimeNumbers(int startRange,int stopRange) {
		for(int index=startRange;index<=stopRange;index++) {
			boolean isPrime=true;
			
			for(int num=2;num<=index/2;num++) {
			
				if(index%num == 0) {
					isPrime=false;
					break;
				}
			}
			if(isPrime==true) {
			primeCount++;
			sum=sum+index;
			}
		}	
		System.out.println("The count of prime number is:"+primeCount+"\nsum of prime numbers is:"+sum+"\nAverage of prime numbers is:"+sum/primeCount);
	}		
	public static void main(String[] args) {
		PrimeNumber pn=new PrimeNumber();
		//pn.primeNumber(17);
		//pn.primeNumbersInGivenRange(100);
		pn.countOfPrimeNumbers(2,100);
		
	}

}
