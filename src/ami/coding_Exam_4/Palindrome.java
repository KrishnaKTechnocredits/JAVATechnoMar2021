package ami.coding_Exam_4;

public class Palindrome {

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
		String input = "Hi MAM hello NamaN techno";
		String[] arr = input.split(" ");
		String output = "";
		for (int index = 0; index < arr.length; index++) {

			if (new Palindrome().isPalindrome(arr[index])) {

				output = output + " " + arr[index];
			}
		}
		System.out.println("Output :" + output);
	}
}
