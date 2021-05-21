/* 5) Average of all the prime numbers given range.
   input : 2 to 100
   output :    */

package amruta.Assignment_23;

public class AverageofPrimeNumber {
	
	int findPrimeNumberAVERAGE(int startnum, int endnum) {
		int average = 0, sum = 0, count =0;;
		 
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
				count++;
				sum = sum + targetnum;
				average = sum/count;
			}
		}
		return average;
	}

	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 2 to 100");
		int startrange = 2;
		int endrange = 100;
		
		int averageofPrimeNum = new AverageofPrimeNumber().findPrimeNumberAVERAGE(startrange, endrange);
		
		System.out.println("------------------------------------------------------");
				
		System.out.println("Average of Prime Numbers from 2 to 100 is : "+averageofPrimeNum);
	}
}
