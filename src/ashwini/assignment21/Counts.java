package ashwini.assignment21;
/*
 1) Count Digits,Letters, UpperCase characters, LowerCase characters, Special characters from predefined string.

Input: 1rRpd3F9#K(E
Output : 
Total digit: 3
Total Letters: 7
Total Uppercase: 4
Total Lowercase: 3
Total Special char: 2

 */

public class Counts {
	void getCount(String str) {
		int upper = 0, lower = 0, digit = 0, special = 0;

		for(int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (ch >= 'A' && ch <= 'Z')
				upper++;
			else if (ch >= 'a' && ch <= 'z')
				lower++;
			else if (ch >= '0' && ch <= '9')
				digit++;
			else
				special++;
		}
		System.out.println("Lower case letters : " + lower);
		System.out.println("Upper case letters : " + upper);
		System.out.println("digit count is : " + digit);
		System.out.println("Special characters : " + special);
	
    }
	
	public static void main(String[] args) {
		Counts count = new Counts();
		count.getCount("1rRpd3F9#K(E");
	}

}
