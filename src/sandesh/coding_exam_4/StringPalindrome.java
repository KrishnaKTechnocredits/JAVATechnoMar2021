package sandesh.coding_exam_4;

public class StringPalindrome {

	boolean checkIfPalindrome(String eachWord) {
		StringBuffer sb = new StringBuffer(eachWord);
		sb.reverse();
		boolean isPalindrome = false;
		if (eachWord.equals(sb.toString())) {
			isPalindrome = true;
		}
		return isPalindrome;
	}

	String[] getEachWord(String input) {
		String[] strArray = input.split(" ");
		boolean isPalindrome = false;
		String[] palindromeArray = new String[strArray.length];
		int count = 0;
		for (int index = 0; index < strArray.length; index++) {
			boolean isPalindromorNot = checkIfPalindrome(strArray[index]);
			if (isPalindromorNot) {
				palindromeArray[count] = strArray[index];
				count++;
			}
		}
		return palindromeArray;

	}

	public static void main(String[] args) {
		String input = "Hi MAM hello NamaN techno";
		String[] palindromeArray = new StringPalindrome().getEachWord(input);
		System.out.println("Palindrome Strings are :- ");
		for (int index = 0; index < palindromeArray.length; index++) {
			if (palindromeArray[index] != null) {
				System.out.println(palindromeArray[index]);
			}
		}
	}
}
