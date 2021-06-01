/*
 Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
 */

package upasana.coding_exam_10;

public class FirstNonRepeatCharInString {

	char getOutput(String str) {
		char output = ' ';
		for (int index = 0; index < str.length(); index++) {
			boolean flag = true;
			if (index == str.indexOf(str.charAt(index))) {

				for (int innerIndex = index + 1; innerIndex < str.length(); innerIndex++) {

					if (str.charAt(index) == str.charAt(innerIndex)) {
						flag = false;
						break;
					}
				}
			}
			if (flag) {
				output = str.charAt(index);
				break;
			}

		}

		return output;
	}

	public static void main(String[] args) {
		String str = "abcgbca";
		char output = new FirstNonRepeatCharInString().getOutput(str);
		System.out.println("First non-repeated character of String is : " + output);
	}
}
