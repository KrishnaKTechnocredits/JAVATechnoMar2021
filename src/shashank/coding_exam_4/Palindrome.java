package shashank.coding_exam_4;

public class Palindrome {

	public void palindromeArray(String str[]) {
		for (int index = 0; index < str.length; index++) {
			StringBuffer sb = new StringBuffer(str[index]);
			sb.reverse();
			if (str[index].contentEquals(sb)) {
				System.out.println(str[index] + " is a palindrome");
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Palindrome palindrome = new Palindrome();
		String input = "Hi MAM hello NamaN techno";
		String str[] = input.split(" ");
		palindrome.palindromeArray(str);
	}

}
