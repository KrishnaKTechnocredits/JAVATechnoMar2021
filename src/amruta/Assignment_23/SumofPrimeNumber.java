/* 4) sum of all the prime numbers given range.
   input : 2 to 100
   output :  */

package amruta.Assignment_23;

public class SumofPrimeNumber {

	int findPrimeNumberSUM(int startnum, int endnum) {
		int sum = 0;
		
		for (int targetnum = startnum; targetnum <= endnum; targetnum++) {
				
			String isPrime = "Yes";
			
			for (int num = 2; num <= targetnum / 2; num++) {
				if (targetnum % num == 0) {
					isPrime = "No";
					break;
				}
			}
			if (isPrime.equals("Yes")) {
				System.out.println("Given Number " + targetnum + " is Prime Number.");
				sum = sum + targetnum;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 2 to 100");
		int startrange = 2;
		int endrange = 100;
		
		int sumofprimeNum = new SumofPrimeNumber().findPrimeNumberSUM(startrange, endrange);
		
		System.out.println("------------------------------------------------------");
				
		System.out.println("Sum of Prime Numbers from 2 to 100 is : "+sumofprimeNum);
	}	
	
}
