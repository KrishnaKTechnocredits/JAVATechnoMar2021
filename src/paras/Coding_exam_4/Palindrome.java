package paras.Coding_exam_4;

public class Palindrome {
	
	void checkPalindrome(String str) {
		String[] arr = str.split(" ");
		for (int index = 0; index < arr.length; index++) {
			if(checkPalindromeInput(arr[index]))
				System.out.println(arr[index]);
		}
	}
	
	boolean checkPalindromeInput(String input) {
		StringBuffer stringb = new StringBuffer(input);
		stringb.reverse();

		if (input.contentEquals(stringb))
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		String input = "Hi MAM hello NamaN techno";
		palindrome.checkPalindrome(input);
	}
}
