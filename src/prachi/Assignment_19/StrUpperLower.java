package prachi.Assignment_19;

/*Assignment 19: 14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits*/

public class StrUpperLower {
	
	static String str = "TeCHnoSessionS";

	String getStrUpperLowerCnt(String str) {

		char ch;
		int upCnt = 0;
		int lowCnt = 0;

		for (int chh = 0 ; chh < str.length(); chh++) {
			ch = str.charAt(chh);
			if (ch >= 'A' && ch <= 'Z') {
				upCnt++;
			}
			else if (ch >= 'a' && ch <= 'z') {
				lowCnt++;
			}
		}
		
		if (upCnt > lowCnt) {
			return "Techno";
		}
		else 
			return "Credits";
	}

	public static void main(String[] args) {
		StrUpperLower sul = new StrUpperLower();
		String maxChars = sul.getStrUpperLowerCnt(str);
		System.out.println("Print: "+maxChars);
	}
}
