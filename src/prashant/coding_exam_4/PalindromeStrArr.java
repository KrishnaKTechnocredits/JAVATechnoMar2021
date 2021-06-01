// Coding Exam _4

package prashant.coding_exam_4;
public class PalindromeStrArr {
	void getPalindrome(String inputword) {
		String word = inputword;
		StringBuffer sb = new StringBuffer(inputword);
		sb.reverse();
		String outputword = sb.toString();
		
		if (word.equals(outputword)) {
			System.out.println(outputword);
		}

	}

	public static void main(String[] args) {
		PalindromeStrArr strPalindrome = new PalindromeStrArr();
		String str = "Hi MAM hello NamaN techno";
		String[] word = str.split(" ");
		System.out.println("Palindrome words from given array ");
		for (int i = 0; i < word.length; i++) {
			strPalindrome.getPalindrome(word[i]);

		}

	}

}
