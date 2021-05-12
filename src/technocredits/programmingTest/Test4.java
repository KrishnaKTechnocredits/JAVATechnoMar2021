package technocredits.programmingTest;

public class Test4 {

	boolean isWordPalindrome(String word) {
		String output = "";
		for (int index = word.length() - 1; index >= 0; index--) {
			output = output + word.charAt(index);
		}
		return output.equals(word);
	}

	String getAllPalindrome(String input) {
		String output = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			boolean isPalindrome = isWordPalindrome(arr[index]);
			if (isPalindrome)
				output = output + arr[index] + " ";
		}
		return output.trim();
	}

	public static void main(String[] args) {
		String answer = new Test4().getAllPalindrome("Hi MAM hello NamaN techno");
		System.out.println(answer);
	}
}
