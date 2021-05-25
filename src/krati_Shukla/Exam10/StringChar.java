/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/

package krati_Shukla.Exam10;

public class StringChar {
	
	void getChar(String str) {
		for(int index=0; index<str.length(); index++) {
			char ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				System.out.println("First Non repeated chatacter is :"+ch);
				break;
			}
		}
		
	}
	
	public static void main(String[]a) {
		StringChar stringChar = new StringChar();
		String input = "abcgbac";
		stringChar.getChar(input);
	}

}
