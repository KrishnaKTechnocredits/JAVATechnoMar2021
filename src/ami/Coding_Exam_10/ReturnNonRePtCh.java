/*
 Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
*/
package ami.Coding_Exam_10;

public class ReturnNonRePtCh {

	char RtnNonRepeatCh(String str) {
		char temp = 0;
		str = str.toLowerCase();
		char ch = ' ';
		char[] input = str.toCharArray();
		for (int index = 0; index < input.length; index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				temp = ch;
				break;
			}
		}
		return temp;
	}

	public static void main(String[] args) {
		ReturnNonRePtCh r1 = new ReturnNonRePtCh();
		String str = "abcgbca";
		 char output = r1.RtnNonRepeatCh(str);
		 System.out.println("first non-repeated character : " + output);

	}
}
