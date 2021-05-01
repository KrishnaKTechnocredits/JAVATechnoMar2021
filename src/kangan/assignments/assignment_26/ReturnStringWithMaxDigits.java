package kangan.assignments.assignment_26;

/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

public class ReturnStringWithMaxDigits {

	int getTotalDigit(String input) {
		int count=0;
		for(int index=0; index<input.length(); index++) {
			if(Character.isDigit(input.charAt(index)))
				count++;
		}
		return count;
	}
	String findNameWithMaxDigit(String[] names) {
		int max = 0;
		String maxDigitName = "";
		
		for(int index=0; index<names.length; index++) {
			int count = getTotalDigit(names[index]);
			if(max<count) {
				max=count;
				maxDigitName = names[index];
			}
		} 
		return maxDigitName;
	}
	public static void main(String[] args) {
		ReturnStringWithMaxDigits returnStringWithMaxDigits = new ReturnStringWithMaxDigits();
		String[] names = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93","1234567890asdfghj"};
		String output = returnStringWithMaxDigits.findNameWithMaxDigit(names);
		System.out.println(output);
	}
}
