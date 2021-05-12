/*Programming Test - 4 : 12th May'2021

String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/

package shilpa.coding_exam_4;

public class palindromeString {
	void getPalindromeFrmString(String str) {
		String[] input = str.split(" ");
		boolean flag = true;
		for (int index = 0; index < input.length; index++) {
			for (int startind = 0, endind = input[index].length() - 1; startind <= endind; startind++, endind--) {
				if (input[index].charAt(startind) != input[index].charAt(endind)) {
					flag = false;
					break;
				} else
					flag = true;
			}
			if (flag == true) {
				System.out.println(input[index] + " ");
			}

		}

	}

	public static void main(String[] args) {
		palindromeString palindromeString = new palindromeString();
		palindromeString.getPalindromeFrmString("Hi MAM hello NamaN techno");
	}

}
