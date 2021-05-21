/*
 Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbgcsa
output : g
 */
package ravindra_J.coding_exam_10;

public class NonRepCharOfString {
	
	void firstNonRepChar(String str) {
		char temp = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);
			boolean flag = false;
			for (int i = 0; i < index; i++) {
				char ch2 = str.charAt(i);
				if (ch1 == ch2) {
					flag = true;
					break;

				}
			}
			if (flag == false) {
				temp = ch1;
			}
		}
		System.out.println("Non Repeted Char:- " + temp);
	}

	public static void main(String[] args) {
		NonRepCharOfString nonrepcarofstring = new NonRepCharOfString();
		String input = "abcgbca";
		nonrepcarofstring.firstNonRepChar(input);
	}

}
