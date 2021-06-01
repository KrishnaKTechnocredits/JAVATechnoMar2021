package upasana.coding_exam_4;

public class Palindrome {

	static void isPalindrome(String input) {

		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			StringBuffer s1 = new StringBuffer(arr[index]);
			if (s1.reverse().toString().equals(arr[index]))
				System.out.println(s1);
		}

	}

	public static void main(String[] args) {
		String input = "Hi MAM hello NamaN techno";
		isPalindrome(input);

	}
}
