package kapil.Test4;

public class Palindrome {

	void getPalindromeString(String[] string) {

		for (int index = 0; index < string.length; index++) {

			StringBuffer sb1 = new StringBuffer(string[index]);
			StringBuffer sb2 = new StringBuffer(string[index]);
			sb2.reverse();
			if (sb1.toString().equals(sb2.toString())) {

				String pal = string[index].toString();

				System.out.println( pal);
			}
		}
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		String input = "Hi MAM NAMAN hello  techno";
		String[] array = input.split(" ");
		palindrome.getPalindromeString(array);
	}

}
