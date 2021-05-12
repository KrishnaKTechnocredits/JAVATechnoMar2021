package radha.CodingTest4;

public class CheckPalindrome {

	void checkPalindromeString(String str) {
			String[] arr = str.split(" ");
			for (int innerIndex = 0; innerIndex < arr.length; innerIndex++) {
				if(checkPalindromeWord(arr[innerIndex]))
					System.out.println(arr[innerIndex]);
			}
	}

	private boolean checkPalindromeWord(String word) {
		StringBuffer sb = new StringBuffer(word);
		sb.reverse();

		if (word.contentEquals(sb))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		CheckPalindrome palindrome = new CheckPalindrome();
		String input = "Hi MAM hello NamaN techno";
		palindrome.checkPalindromeString(input);
	}

}
