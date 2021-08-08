package gauravk.Assignment_25;
/*
 * After Lecture - 17_April_Session-26_PrimeNum After Lecture - 18_April_Session-27_Array_As_ReturnType Assignment - 25 : 18th April'2021
Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
End Index -> 50
Output : 11 13 17 19 23
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25
Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */
public class FirstFivePrimeNumbers {
	public static void main(String[] a) {
		int[] firstFivePrime = new FirstFivePrimeNumbers().primeExtraction(10, 50);
		System.out.println("First five prime numbers:");
		for(int i=0; i<5; i++) {
			System.out.print(firstFivePrime[i]+",");
		}
	}
	
	int[] primeExtraction(int sNum, int eNum) {
		int index=sNum;
		int count=0;
		int [] fivePrime = new int[5];
		for(; index<eNum; index++) {
			int targetNum = index;
			boolean bool = true;
			for(int i=2; i<=targetNum/2; i++) {
				if(targetNum%i == 0) {
					bool = false;
					break;
				}
			}
			if(bool) {
				if(count<5) {
					fivePrime[count]=targetNum;
					count++;
				}
			}
		}
		return fivePrime;
	}
}