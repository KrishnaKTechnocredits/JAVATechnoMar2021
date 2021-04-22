package krishna.Assignment_26;

public class ReturnStringMaxDigit {
	String returnMaxDigitFromString(String[] name) {
		int max = 0;
		String maxDigit = "";
		for (int index = 0; index < name.length; index++) {
			int count = 0;
			for (int innerIndex = 0; innerIndex < name[index].length(); innerIndex++) {
				char ch = name[index].charAt(index);
				if (Character.isDigit(ch)) {
					count++;
				}
			}
			if (max < count) {
				max = count;
				maxDigit = name[index];
			}
		}
		return maxDigit;
	}

	public static void main(String[] args) {
		ReturnStringMaxDigit returnStringMaxDigit = new ReturnStringMaxDigit();
		String[] words = {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"};
		String maxString = returnStringMaxDigit.returnMaxDigitFromString(words);
		System.out.println("The words have miximum digit is : " + maxString);
	}
}
