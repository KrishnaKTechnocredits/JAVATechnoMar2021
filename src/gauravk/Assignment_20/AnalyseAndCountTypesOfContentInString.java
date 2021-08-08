package gauravk.Assignment_20;
/*
 * After Lecture - 14th_April_Session-23_Character_Class_Ascii_Value Assignment 20: 14th April'2021
1) Count Digits, Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.
Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 */
public class AnalyseAndCountTypesOfContentInString {
	
	void analyseStringContent(String s) {
		int digitCount=0, letterCount=0, upperCaseCount=0, lowerCaseCount=0, specialCharacterCount=0;
		for(int i=0; i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i)))
				digitCount++;
			else if(Character.isLetter(s.charAt(i))) {
					letterCount++;
					if(Character.isUpperCase(s.charAt(i)))
						upperCaseCount++;
					else lowerCaseCount++;
			}
			else specialCharacterCount++;
		}
		
		System.out.println("Analysis of String contents: "+s);
		System.out.println("Total Digits: "+digitCount);
		System.out.println("Total Letters: "+letterCount);
		System.out.println("Total Uppercase letters: "+upperCaseCount);
		System.out.println("Total Lowercase letters: "+lowerCaseCount);
		System.out.println("Total Special characters: "+specialCharacterCount);
	}
	
	public static void main(String[] a) {
		new AnalyseAndCountTypesOfContentInString().analyseStringContent("1rRpd3F9#K(E");;
	}
}
