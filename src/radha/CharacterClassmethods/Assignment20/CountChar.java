/* 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

package radha.CharacterClassmethods.Assignment20;

public class CountChar {
	
	void count(String str) {
		int digitCount =0, letterCount=0, UCaseCount =0, LCaseCount = 0, SpclCharCnt = 0;
		
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(Character.isDigit(ch))
				digitCount++;
			else if(Character.isUpperCase(ch))
				UCaseCount++;
			else if(Character.isLowerCase(ch))
				LCaseCount++;
			else
				SpclCharCnt++;
		}
		System.out.println("Total count of digits in the string: "+digitCount);
		System.out.println("Total count of Letters in the string: "+(UCaseCount+LCaseCount));
		System.out.println("Total count of UpperCase characters in the string: "+UCaseCount);
		System.out.println("Total count of LoweCase characters in the string: "+LCaseCount);
		System.out.println("Total count of Special characters in the string: "+SpclCharCnt);
	}
	
	public static void main(String[] args) {
		CountChar countChar = new CountChar();
		String input = "1rRpd3F9#K(E";
		System.out.println("Input string is "+input);
		System.out.println("==========================================");
		countChar.count(input);
	}
}
