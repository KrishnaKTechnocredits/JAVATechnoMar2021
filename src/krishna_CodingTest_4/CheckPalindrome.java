package krishna_CodingTest_4;

public class CheckPalindrome {
	void checkPalindromeString(String givenString) {
		String[] array = givenString.split(" ");

		for (int index = 0; index < array.length; index++) {
			if (checkPalindromeWord(array[index]))
				System.out.println(array[index]);
		}
	}

	boolean checkPalindromeWord(String word) {
		StringBuffer stringBuffer = new StringBuffer(word);
		stringBuffer.reverse();
		return (word.contentEquals(stringBuffer));
	}

	public static void main(String[] args) {
		CheckPalindrome palindrome = new CheckPalindrome();
		String GivenInput = "Hi MAM hello NamaN techno";
		palindrome.checkPalindromeString(GivenInput);

	}
}
