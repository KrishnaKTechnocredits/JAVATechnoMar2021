package sai.assignment26;

public class StringMaxNumbers {

	public static void main(String[] args) {

		StringMaxNumbers stringMaxNumbers = new StringMaxNumbers();
		String[] arr = { "TechnoCredits", "HP1w", "Pd3R4K9", "Krishna", "Aashvi25" };
		String maxString;
		maxString = stringMaxNumbers.maxDigitInString(arr);
		System.out.println("Word containing maximum digits is " + maxString);

	}

	String maxDigitInString(String[] str) {
		int max = 0;
		String maxDigit = "";
		for (int index = 0; index < str.length; index++) {
			int cnt = 0;
			for (int index1 = 0; index1 < str[index].length(); index1++) {
				char ch = str[index].charAt(index);
				if (Character.isDigit(ch)) {
					cnt++;
				}

			}
			if (max < cnt) {
				max = cnt;
				maxDigit = str[index];
			}
		}
		return maxDigit;
	}
}
