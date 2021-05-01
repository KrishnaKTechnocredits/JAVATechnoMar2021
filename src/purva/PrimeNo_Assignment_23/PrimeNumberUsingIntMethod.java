package purva.PrimeNo_Assignment_23;

public class PrimeNumberUsingIntMethod {
	
	
	//1) validate whether given number is prime or not.
	void primeOrNot(int number) {
		int index =2;
		for(; index <= number/2; index++) {
			if(number%index == 0) {
			    break;
			}
		}
		if((number/2 +1)==index) {
	        System.out.println(number+" is prime");
		  
		}
		//else
			//System.out.println(number +" is not prime");
	}
	
	/*2) print all the prime numbers given range.
	input : 40 to 100*/
	
	void printAllPrimeNumber(int startRange,int endRange) {
		for(int num =startRange; num<=endRange;num++) {
	        primeOrNot(num);
		}
	}
	
	public static void main(String [] a) {
		PrimeNumberUsingIntMethod primeNumber = new PrimeNumberUsingIntMethod();
		primeNumber.primeOrNot(18);
		primeNumber.primeOrNot(19);
		System.out.println("-----------------------"+"\n prime number are:");
		primeNumber.printAllPrimeNumber(40,100);
		
		
	}
}
