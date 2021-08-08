package gauravk.Assignment_25;
/*
 * After Lecture - 17_April_Session-26_PrimeNum After Lecture - 18_April_Session-27_Array_As_ReturnType Assignment - 25 : 18th April'2021
Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */
public class SumOfDigitsByStringArray {
	static int count=0;
	
	public static void main(String[] a) {
		String[] input = {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"};
		int[] sumOfStringWithDigits = new SumOfDigitsByStringArray().stringDigitExtraction(input);
		System.out.println("Sum of each all numbers in each strings are :");
		for(int i=0; i<count; i++) {
			System.out.print(sumOfStringWithDigits[i]+",");
		}
	}
	
	int[] stringDigitExtraction(String[] names) {
		int[] arr = new int[names.length];
		for(int index=0; index<names.length; index++) {
			String targetString = names[index];
			boolean bool = true;
			int sum = 0;
			for(int i=0; i<names[index].length(); i++) {
				if(Character.isDigit(names[index].charAt(i))) {
					bool = false;
					sum=sum+Character.getNumericValue(targetString.charAt(i));
				}
			}
			if(!bool) {
				arr[count]=sum;
					count++;
			}
		}
		return arr;
	}
}