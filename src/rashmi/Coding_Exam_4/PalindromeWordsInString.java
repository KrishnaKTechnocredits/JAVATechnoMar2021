/*Programming Test - 4 : 12th May'2021


String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

package rashmi.Coding_Exam_4;

public class PalindromeWordsInString {

	private String isPalindrome(String input) {
		String output = "";
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		if (sb.toString().equals(input)) {
			output += input + " ";

		}
		return output;
	}

	public String getWord(String input) {
		String output = "";
		String[] arr = input.split(" ");
		for (int index = 0; index < arr.length; index++) {
			output += isPalindrome(arr[index]);

		}

		return output = output.trim();
	}

	public static void main(String[] args) {
		System.out.println(new PalindromeWordsInString().getWord("Hi MAM hello NamaN techno"));

	}

}
