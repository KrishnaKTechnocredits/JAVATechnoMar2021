package sai.Assignment25;

public class StringSumOfNums {

	int getSumNumStr(String str) {
		int numsum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				numsum = numsum + Character.getNumericValue(str.charAt(i));
			}
		}
		return numsum;
	}

	public static void main(String[] args) {
		StringSumOfNums stringSumOfNums = new StringSumOfNums();
		String[] strarr = { "Tech1No2Credits3", "Ha6rs8h", "Ra9dh3a", "Sha1sha5nk9", "Kan3gan4", "1Sandesh3" };
		System.out.println("Sum of all numbers in each String is ");
		for (int i = 0; i < strarr.length; i++) {
			int result = stringSumOfNums.getSumNumStr(strarr[i]);
			if (result != 0)
				System.out.println(result);
		}
	}
}
