/* 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2
 */

package radha.WithoutCharClassMethods.Assignment21;

public class FindCount {
	void getCount(String str) {
		int digitCount =0, UCaseCount =0, LCaseCount = 0, SpclCharCnt = 0;
		
		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if(ch >= 48 && ch <=57)
				digitCount++;
			else if(ch >= 65 && ch <=90)
				UCaseCount++;
			else if(ch >= 97 && ch <=122)
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
		FindCount count = new FindCount();
		String input = "1rRpd3F9#K(E";
		System.out.println("Input string is "+input);
		System.out.println("==========================================");
		count.getCount(input);
	}
}
