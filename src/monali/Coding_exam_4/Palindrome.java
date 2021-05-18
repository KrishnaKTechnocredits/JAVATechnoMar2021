package monali.Coding_exam_4;

public class Palindrome {

	String namePalindrome(String name1) {
		StringBuffer sb1 = new StringBuffer(name1);
		sb1.reverse();
		if (sb1.toString().equalsIgnoreCase(name1))
			return name1;
		else
			return "";
	}

	String[] palindrome(String name) {
		String[] arr = name.split(" ");
		String[] output = new String[arr.length];
		for (int index = 0; index < arr.length; index++) {
			output[index] = namePalindrome(arr[index]);

		}
		return output;
	}

	public static void main(String[] args) {
		Palindrome word = new Palindrome();
		String arr = "Hi MAM Hello NamaN techno";
		String[] output = word.palindrome(arr);
		for (int index = 0; index < output.length; index++) {
			System.out.println(output[index]);
		}
	}
}
