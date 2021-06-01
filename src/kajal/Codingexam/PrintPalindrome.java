package kajal.Codingexam;

public class PrintPalindrome {

	public void palindrom(String input[]) {
		for (int index = 0; index < input.length; index++) {
			StringBuffer sb = new StringBuffer(input[index]);
			sb.reverse();
		
			if (input[index].equals(sb.toString()))
				System.out.println(input[index]);
			
		}
	}

	public static void main(String[] args) {
		PrintPalindrome print = new PrintPalindrome();
		String string1 = "Hi MAM hello NamaN techno";
		String str[] = string1.split(" ");
		print.palindrom(str);
	}
}
