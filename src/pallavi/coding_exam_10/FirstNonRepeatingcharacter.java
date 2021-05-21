package pallavi.coding_exam_10;

/*Print the first non-repeated character of String.
Input : abcgbca
output : g*/
public class FirstNonRepeatingcharacter {

	char firstNonrepeatedCharcter(String str) {
		char output = ' ';
		for (int index = 0; index < str.length(); index++) {
			char ch1 = str.charAt(index);
			if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
				output = str.charAt(index);
				break;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		String input = "abcgbca";
		char output = new FirstNonRepeatingcharacter().firstNonrepeatedCharcter(input);
		System.out.println(output);
	}

}
