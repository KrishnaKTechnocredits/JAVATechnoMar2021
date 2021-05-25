package neha_Rathi.codingExam4;

public class Palindrom1 {
	static int temp = 0;

	boolean calPalString(String input) {
		boolean isPalindrom = false;
		StringBuffer sb = new StringBuffer(input);
		sb.reverse();
		if (input.equals(sb.toString()))
			isPalindrom = true;
		return isPalindrom;
	}

	String[] calPalString(String[] input) {
		String[] output = new String[input.length];
		for (int index = 0; index < input.length; index++) {
			if (calPalString(input[index])) {
				output[temp] = input[index];
				temp++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Palindrom1 Palindrom1 = new Palindrom1();
		String input = "Hi MAM hello NamaN techno";
		String[] arr = input.split(" ");
		String[] result = Palindrom1.calPalString(arr);
		for (int index = 0; index < temp; index++) {
			System.out.println(result[index]);
		}
	}
}
