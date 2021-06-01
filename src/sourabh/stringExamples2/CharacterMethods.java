/*Assignment 20:  14th April'2021

1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

package sourabh.stringExamples2;

public class CharacterMethods {
	void getTotalDigit(String str) {
		int digitCount=0, upperCaseCount=0,lowerCaseCount=0, letterCount=0, specialCharCount=0;
		for(int index=0; index<str.length(); index++) {
			char ch=str.charAt(index);
			if(Character.isDigit(ch))
				digitCount++;
			else if(Character.isLetter(ch))
				letterCount++;
			else
				specialCharCount++;
			
			if(Character.isUpperCase(ch))
				upperCaseCount++;
			if(Character.isLowerCase(ch))
				lowerCaseCount++;			
		}		
		System.out.println("Total digit: "+digitCount);
		System.out.println("Total Letters: "+letterCount);
		System.out.println("Total Uppercase: "+upperCaseCount);
		System.out.println("Total Lowercase: "+lowerCaseCount);
		System.out.println("Total Special char: "+specialCharCount);
	}
	public static void main(String[] args) {
		CharacterMethods characterMethods=new CharacterMethods();
		characterMethods.getTotalDigit("1rRpd3F9#K(E");
	}

}
