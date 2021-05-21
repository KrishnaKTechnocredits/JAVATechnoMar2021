package shashank.assignment_26;

public class MaxDigitsString {
	public void maxDigitString(String strArray[]) {
		boolean flag = false;
		int cnt;
		int arr[] = new int[strArray.length];
		for (int index = 0; index < strArray.length; index++) {
			cnt = 0;
			char ch[] = strArray[index].toCharArray();
			for (int j = 0; j < ch.length; j++) {
				flag = Character.isDigit(ch[j]);
				if (flag)
					cnt++;
			}
			arr[index] = cnt;
		}
		int max = 0;
		for (int index = 0; index < arr.length; index++) {

			if (arr[index] > max)
				max = index;
		}
		System.out.println(strArray[max]);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MaxDigitsString maxDigitInString = new MaxDigitsString();
		String arr[] = { "P1u2r2va", "1K2omal", "9S4hivan4i4", "1K2r3ati", "4M4a5d5h1v1i93" };
		maxDigitInString.maxDigitString(arr);
	}

}
