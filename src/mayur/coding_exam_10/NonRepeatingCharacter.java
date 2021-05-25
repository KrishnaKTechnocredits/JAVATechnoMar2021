package mayur.coding_exam_10;

public class NonRepeatingCharacter {
	char getNonRepeatingCharacter(String str) {
		char ch = ' ';
		for (int index = 0; index < str.length(); index++) {
			ch = str.charAt(index);
			if (str.indexOf(ch) == str.lastIndexOf(ch)) {
				ch = str.charAt(index);
				break;
			}
		}
		System.out.println("Enter the String " +str);
		System.out.println("The non repeated character in the string is " +ch);
		return ch;
	}

	public static void main(String[] args) {
		NonRepeatingCharacter non = new NonRepeatingCharacter();
		String str = "abcgbca";
		non.getNonRepeatingCharacter(str);


	}
}
