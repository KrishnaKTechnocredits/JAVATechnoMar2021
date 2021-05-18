package madhavi_Khasbage.ArrayPrograms;

/*Program 1: Write a method which will return a string containing maximum digits.
Input : {"P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93"}
Output : 4M4a5d5h1v1i93*/

public class StringHavingMaxNum {
	String findStringHavingMaxNum(String[] arrStr) {
		String finalString = "";
		int cnt = 0, maxNum = 0;
		for (int index = 0; index < arrStr.length; index++) {
			cnt = 0;
			for (int index1 = 0; index1 < arrStr[index].length(); index1++) {
				if (Character.isDigit(arrStr[index].charAt(index1)) == true) {
					cnt++;
				}
			}
			if (cnt > maxNum) {
				finalString = arrStr[index];
				maxNum = cnt;
			}
		}
		return finalString;
	}

	public static void main(String[] args) {
		StringHavingMaxNum numInStr = new StringHavingMaxNum();
		String[] arr = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		System.out.println(numInStr.findStringHavingMaxNum(arr));
	}

}
