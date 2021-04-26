package shivani.Assignment_26;



//Write a method which will return a string containing max digit
public class ReturnMaxdigitString {
	
	int Count(String str) {
		int Cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			char ch = str.charAt(index);
			if (Character.isDigit(ch))
				Cnt++;
		}
		return Cnt;
	}

	int[] getDigitCount(String[] str) {
		int[] digitCount = new int[str.length];

		for (int index = 0; index < str.length; index++) {
			digitCount[index] = Count(str[index]);
		}
		return digitCount;
	}

	int getMaxNumIndex(int[] arr) {

		int maxStringIndex = 0;
		int maxNum = arr[0];

		for (int index = 1; index < arr.length; index++) {
			if (maxNum < arr[index]) {
				maxNum = arr[index];
				maxStringIndex = index;
			}
		}
		return maxStringIndex;
	}

	public static void main(String[] args) {
		ReturnMaxdigitString returnMaxdigitString = new ReturnMaxdigitString();

		String[] inputStr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };

		int[] count = returnMaxdigitString.getDigitCount(inputStr);
		int maxNumIndex = returnMaxdigitString.getMaxNumIndex(count);

		System.out.println("String with maximum digits : -> \n" + inputStr[maxNumIndex]);
	}

}
