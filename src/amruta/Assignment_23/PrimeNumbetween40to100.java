/* 2) print all the prime numbers given range.
   input : 40 to 100
   output : */

package amruta.Assignment_23;

public class PrimeNumbetween40to100 {
	
	//using count variable

	void findPrimeNumbercount(int startnum, int endnum) {
		for (int targetnum = startnum; targetnum <= endnum; targetnum++) {
			
			//int targetnum = index;
			int count = 0;
			
			for (int num = 2; num <= targetnum / 2; num++) {
				if (targetnum % num == 0) {
					count = 1;
					break;
				}
			}
			if (count == 0)
				System.out.println("Given Number " + targetnum + " is Prime");
		}
	}

	// using boolean flag...
	
	void findPrimeNumbercountboolean(int startnum, int endnum) {
		for (int index = startnum; index <= endnum; index++) {
			
			int targetnum = index;
			boolean isPrimeflag = true;
			
			for (int num = 2; num <= targetnum / 2; num++) {
				if (targetnum % num == 0) {
					isPrimeflag = false;
					break;
				}
			}
			if (isPrimeflag)
				System.out.println("Given Number " + targetnum + " is Prime");
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Prime numbers between 40 to 100");
		int startrange = 40;
		int endrange = 100;
		
		System.out.println("-----------------using count variable-------------------------");
		new PrimeNumbetween40to100().findPrimeNumbercount(startrange, endrange);
		
		System.out.println("-----------------using boolean flag---------------------------");
		new PrimeNumbetween40to100().findPrimeNumbercountboolean(startrange, endrange);
	}
}
