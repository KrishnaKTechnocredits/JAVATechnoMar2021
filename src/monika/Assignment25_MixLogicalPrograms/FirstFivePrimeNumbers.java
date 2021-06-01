package monika.Assignment25_MixLogicalPrograms;

/*Assignment - 25 : 18th April'2021

Program 1: Write a method which will return first 5 prime numbers from given range. Main method should print the output.
Input : Start Index -> 10
        End Index -> 50
Output : 11 13 17 19 23
 
Program 2: Write a method which will return all String from given array which contains atleast one number. Main method should print the output.
Input : {"TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25"}
Output : HP1w Pd3R4K9 Aashvi25

Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 */

public class FirstFivePrimeNumbers {

	/*int[] returnPrimeNo(int startIndex, int endIndex) { //2 to 100
		int[] arr = new int[5];
			for(;startIndex<=endIndex;startIndex++) {
				for(int index = 2;index<=startIndex;index++)
					if(!(startIndex % index == 0))
						arr[index] = startIndex;
					else if()
				}
			}
		return arr;}*/
	
	boolean validatePrime1(int input) {
		boolean isPrimeFlag = true;
		for(int i = 2;i<input;i++) {
			if(input % i == 0)
				isPrimeFlag = false;
			
		}return isPrimeFlag;
	}
	
	int[] returnPrime(int start, int end) {
		boolean flag = false;
		int[] arr = new int[5];
			for(;start<end;start++) {
				flag = validatePrime1(start);
				if(flag)
					arr[0] = start;
					arr[1] = start;
			}
			return arr;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FirstFivePrimeNumbers obj = new FirstFivePrimeNumbers();
		int[] arr;
		arr = obj.returnPrime(2, 50);
		for(int index=0;index<arr.length;index++)
			System.out.println(arr[index]);
	}

}
