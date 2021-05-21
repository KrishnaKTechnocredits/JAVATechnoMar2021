package pavan.PavanB_coding_exam_4;

public class CheckPalindrome {

	void checkIfPal(String input) {

		String org = input;
		String rev = "";

		for (int index = input.length() - 1; index < input.length(); index--) {
			char ch = input.charAt(index);
			rev = rev + ch;

			if (index == 0)
				break;
		}

		if (rev.equals(org))
			System.out.println(org);
	}

	void sendcheck(String input) {
		String[] arr = input.split(" ");

		for (int index = 0; index < arr.length; index++) {
			checkIfPal(arr[index]);

		}
	}

	public static void main(String[] args) {
		CheckPalindrome c = new CheckPalindrome();
		c.sendcheck("Hi mam hello naman techno");

	}
}
