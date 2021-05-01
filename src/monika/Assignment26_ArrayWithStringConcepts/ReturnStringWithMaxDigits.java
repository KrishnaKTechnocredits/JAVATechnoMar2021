package monika.Assignment26_ArrayWithStringConcepts;

/*Assignment - 26 : 19th April'2021

Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/
public class ReturnStringWithMaxDigits {
	String[] returnStringWithMaxDigits(String[] arr) {
		String[] arrResult = new String[1];
		int count = 0, ResultCount = 0;
		for (int index = 0; index < arr.length; index++) {
			for (int innerindex = 0; innerindex < arr[index].length(); innerindex++) {
				if (Character.isDigit(arr[index].charAt(innerindex)))
					count++;
			}
			if (ResultCount < count) {
				ResultCount = count;
				arrResult[0] = arr[index];
			}
			count = 0;
		}
		// System.out.println(arrResult[0]);
		return arrResult;
	}

	public static void main(String[] args) {
		ReturnStringWithMaxDigits obj = new ReturnStringWithMaxDigits();
		String[] arr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		String[] captureResult;
		captureResult = obj.returnStringWithMaxDigits(arr);
		System.out.println(captureResult[0]);
	}
}
