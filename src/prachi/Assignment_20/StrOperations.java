package prachi.Assignment_20;

/*Assignment 20: 14th April'2021
1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output :
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2*/


public class StrOperations {

	static String str = "1rRpd3F9#K(E";

	void strOperations(String str1) {
		int digitCnt = 0;
		int upperCnt = 0;
		int lowerCnt = 0;
		int specialCharCnt = 0;
		int length = str.length();

		for (int index=0; index < length; index++) {
			
			char ch= str.charAt(index);
			
			if (Character.isDigit(ch))
				digitCnt++;

			else if (Character.isUpperCase(ch)) 
				upperCnt++;
			
			else if (Character.isLowerCase(ch)) 
				lowerCnt++;
						
			else
				specialCharCnt++;
		}
		
		System.out.println("Total digit: " + digitCnt);
		System.out.println("Total Letters: " + (upperCnt + lowerCnt));
		System.out.println("Total Uppercase: " + upperCnt);
		System.out.println("Total Lowercase: " + lowerCnt);
		System.out.println("Total Special char: " + specialCharCnt);
	}

	public static void main(String[] args) {
		StrOperations so = new StrOperations();
		so.strOperations(str);
	}
}