/*
Assignment 19:  14th April'2021
Program 1: Write a method which will return "Techno" if Uppercase character count is higher then LowerCase character count, otherwise return "Credits". Print output in main method.

input : TeCHnoSessionS
output : Credits
 */

package radha.CharMethods.Assignment19;

public class Assignment19 {
	
	void getUcaseCount(String str) {
		int upperCaseCnt = 0;
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isUpperCase(ch))
				upperCaseCnt++;
		}
		if(upperCaseCnt > (str.length() - upperCaseCnt)) {
			System.out.println("Techno");
		}else {
			System.out.println("Credits");
		}
		System.out.println("================================================================");
		System.out.println("Uppercase character count is "+upperCaseCnt+" & Lowercase character count is "+(str.length() - upperCaseCnt));
	}
	
	public static void main(String[] args) {
		Assignment19 charCount = new Assignment19();
		charCount.getUcaseCount("TeCHnoSessionS");
	}
}

/*
Output:

Credits
================================================================
Uppercase character count is 5 & Lowercase character count is 9
 */
