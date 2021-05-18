package prachi.Coding_Exam_4;



/*String input = "Hi MAM hello NamaN techno";
	output : MAM NamaN*/

public class PalindromeString {
	static String input = "Hi MAM hellolleh NamaN techno";

	boolean isPalindrome(String str) {
		StringBuffer sb1 = new StringBuffer(str);
		StringBuffer sb2 = new StringBuffer(str);
		sb2.reverse();

		if (sb1.toString().equals(sb2.toString()))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		PalindromeString gps = new PalindromeString();
		String[] arr = input.split(" ");
		String output = "";
		for (int index = 0; index < arr.length; index++) {
			if (gps.isPalindrome(arr[index])) {
				output = output + " " + arr[index];
			}
		}
		System.out.println("Output :" + output);
	}
}