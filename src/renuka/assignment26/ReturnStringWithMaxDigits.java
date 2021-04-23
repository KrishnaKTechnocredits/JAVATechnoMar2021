package renuka.assignment26;

public class ReturnStringWithMaxDigits {
	
	int countDigitsInString(String names) {
		int cnt = 0;
		for (int index = 0; index < names.length(); index++) {
			char ch = names.charAt(index);
			if (Character.isDigit(ch)) {
				cnt++;
			}
		}
		return cnt;
	}

	String getMaxDigitString(String[] names) {
		String output = null;
		int maxCnt = 0;
		for (int index = 0; index < names.length; index++) {
			int cnt = 0;
			cnt = countDigitsInString(names[index]);
			if (maxCnt < cnt) {
				maxCnt = cnt;
				output = names[index];
			}
		}
		return output;
	}

	public static void main(String[] a) {
		ReturnStringWithMaxDigits returnMaxDigitString = new ReturnStringWithMaxDigits();
		String[] names = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String output = returnMaxDigitString.getMaxDigitString(names);
		System.out.println("String with maximum digits is " + output);
	}

}
