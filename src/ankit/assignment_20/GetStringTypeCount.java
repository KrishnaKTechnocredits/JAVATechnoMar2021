// WAP to Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

package ankit.assignment_20;

public class GetStringTypeCount {
	int upperCount, lowerCount, isDigitCount ;

	void idDigit(String str) {
		int size = str.length();
		for(int index = 0 ; index < size ; index++) {
			if(Character.isDigit(str.charAt(index))) {
				isDigitCount++;
			}	
		}System.out.println("Digits count in String is :"+isDigitCount);
	}

	void lettersCount() {
		int totalLettersCount = upperCount + lowerCount;
		System.out.println("Total letters count :"+totalLettersCount);

	}
	void upperCaseCount(String str) {
		int size = str.length();
		for(int index = 0 ; index < size ; index++) {
			if(Character.isUpperCase(str.charAt(index))) {
				upperCount++;
			}	
		}System.out.println("Upper Case count in String is :"+upperCount);


	}
	void lowerCaseCount(String str) {
		int size = str.length();
		for(int index = 0 ; index < size ; index++) {
			if(Character.isLowerCase(str.charAt(index))) {
				lowerCount++;
			}	
		}System.out.println("Upper Case count in String is :"+lowerCount);

	}
	void specialCharacterCount(String str) {
		int size = str.length();
		int specialCharCount = size - (upperCount+lowerCount+isDigitCount);
		System.out.println("Special Character Count :"+specialCharCount);
	}

	public static void main(String[] args) {
		GetStringTypeCount getStringTypeCount = new GetStringTypeCount();
		String str = "AAA88bbb^&^%$";
		int size = str.length();
		System.out.println("String is :"+ str);
		System.out.println("-------------------");
		getStringTypeCount.idDigit(str);
		getStringTypeCount.upperCaseCount(str);
		getStringTypeCount.lowerCaseCount(str);
		getStringTypeCount.lettersCount();
		getStringTypeCount.specialCharacterCount(str);

	}

}

/*
Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

2) WAP to sum all the numbers in given string.
Input: J7yu9y8h1h8j4b7j3jjb6
Ouput: Sum of all digits in String is: 53
 */