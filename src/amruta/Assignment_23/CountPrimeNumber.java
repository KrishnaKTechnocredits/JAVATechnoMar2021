/*  3) count all the prime numbers given range.
   input : 2 to 100
   output :    */
 
package amruta.Assignment_23;

public class CountPrimeNumber {
	
	int findPrimeNumbercount(int startnum, int endnum) {
		int primeNumCount = 0;
		
		for (int index = startnum; index <= endnum; index++) {
			int targetnum = index;	
			String isPrime = "Yes";
			
			for (int num = 2; num <= targetnum / 2; num++) {
				if (targetnum % num == 0) {
					isPrime = "No";
					break;
				}
			}
			if (isPrime.equals("Yes")) {
				System.out.println("Given Number " + targetnum + " is Prime Number.");
				primeNumCount++;
			}
		}
		return primeNumCount;
	}

	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 2 to 100");
		int startrange = 2;
		int endrange = 100;
		
		int count = new CountPrimeNumber().findPrimeNumbercount(startrange, endrange);
		
		System.out.println("------------------------------------------------------");
				
		System.out.println("Count of Prime Numbers from 2 to 100 is : "+count);
	}
}
