package anubhav.StringOperations;

public class Palindrome {

	String toCheckString = "Hi Mam Hello Naman Techno";
	String[] toCheckStringArray = toCheckString.split(" ");

	void palindromeWord(String toCheck) {

		String toCheckReverse = "";
		for (int index = toCheck.length() - 1; index >= 0; index--) {
			toCheckReverse = toCheckReverse + toCheck.charAt(index);
		}
		if (toCheck.equalsIgnoreCase(toCheckReverse))
			System.out.print(" " + toCheck);
	}

	void checkAllWords() {
		for (int arrayIndex = 0; arrayIndex <= toCheckStringArray.length - 1; arrayIndex++) {
			palindromeWord(toCheckStringArray[arrayIndex]);
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		palindrome.checkAllWords();
	}
}
