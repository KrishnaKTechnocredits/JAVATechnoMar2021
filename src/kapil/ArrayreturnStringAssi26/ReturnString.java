//Program : WAP which will return a string containing maximum digits.

package kapil.ArrayreturnStringAssi26;

public class ReturnString {

	int gettotalDigit(String input) {
		int cnt = 0;
		for (int index = 0; index < input.length(); index++) {
			if (Character.isDigit(input.charAt(index)))
				cnt++;
		}
		return cnt;
	}

	String findMaxiDigitNum(String[] arr) {
		int max = 0;
		String maxDigitName = "";
		for (int index = 0; index < arr.length; index++) {
			int count = gettotalDigit(arr[index]);
			if (max < count) {
				max = count;
				maxDigitName = arr[index];
			}
		}
		System.out.println("Maximum digits  String Name = " + maxDigitName);
		return maxDigitName;
	}

	public static void main(String[] args) {
		ReturnString returnstring = new ReturnString();
		String[] Arrayname = { "P1u2r2va", "1k2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		returnstring.findMaxiDigitNum(Arrayname);
	}
}
