package shashank.coding_exam_11;

/*Programming Test - 10 : 19th May'2021 (12 mins) 

Print the first non-repeated character of String.
Input : abcgbca
output : g
*/
public class FirstNonRepeatCharacter {

	char getNonRepeatChar(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				ch = str.charAt(index);
				break;
			}
		}
		return ch;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstNonRepeatCharacter firstNonRepeatCharacter = new FirstNonRepeatCharacter();
		String str = "abcgbca";
		char ch = firstNonRepeatCharacter.getNonRepeatChar(str);
		System.out.println("First non repeated charachter of string " + str + " is " + ch);
	}

}
