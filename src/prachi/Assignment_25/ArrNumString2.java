package prachi.Assignment_23;

/*Program 3: Write a method which will return sum of each all numbers in each String. Main method should print the output.
Input : {"Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9","Kan3gan4", "1Sandesh3"}
Output : 6 14 12 15 7 4
 */

public class ArrNumString2 {

	int getSumOfDigitsInString(String str) {
		int strNumberSum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				strNumberSum = strNumberSum + Character.getNumericValue(str.charAt(i));
			}
		}
		return strNumberSum;
	}

	public static void main(String[] args) {
		ArrNumString2 sumOfDigitsInString = new ArrNumString2();
		String[] string_2 = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		System.out.println("Sum of digits present in each string elemenrt is: ");
		for (int i = 0; i < string_2.length; i++) {
			int returnArrInt = sumOfDigitsInString.getSumOfDigitsInString(string_2[i]);
			if (returnArrInt != 0)
				System.out.println(returnArrInt);
		}
	}	
}
