package komal.coding_exam_4;

/*String input = "Hi MAM hello NamaN techno";
output : MAM NamaN*/
public class PalindromeString {

	void getPalindromeFrmString(String str) {
		String[] input = str.split(" ");
		for (int index = 0; index < input.length; index++) {
			StringBuffer sb1 = new StringBuffer(input[index]);
			if (input[index].toString().equals(sb1.reverse().toString()))
				System.out.println(input[index]);
		}
	}

	public static void main(String[] args) {
		PalindromeString palindromeString = new PalindromeString();
		palindromeString.getPalindromeFrmString("Hi MAM hello NamaN techno");
	}

}
