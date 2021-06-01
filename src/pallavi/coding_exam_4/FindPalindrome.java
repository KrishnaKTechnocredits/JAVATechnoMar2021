package pallavi.coding_exam_4;

/*String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

public class FindPalindrome {

	String reverse = "";

	void checkPalindrome(String word) {
		for (int index = word.length() - 1; index >= 0; index--) {
			char ch = word.charAt(index);
			reverse = reverse + ch;
		}

		if (reverse.equals(word)) {
			System.out.println(reverse);
		}
		reverse = "";

	}

	void takeString(String str) {
		String word[] = str.split(" ");
		for (int index = 0; index < word.length; index++)
			checkPalindrome(word[index]);

	}

	public static void main(String[] args) {
		String input = "Hi MAM hello NamaN techno";
		new FindPalindrome().takeString(input);
	}

}
