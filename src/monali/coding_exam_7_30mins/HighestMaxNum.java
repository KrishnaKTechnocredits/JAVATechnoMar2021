package monali.coding_exam_7_30mins;

public class HighestMaxNum {

	int missNumber(int[] arr) {
		int highestnum = 0;
		for (int index = 1; index <= 10; index++) {
			boolean isnumpresent = false;
			for (int i = 0; i < arr.length; i++) {
				if (index == arr[i]) {
					isnumpresent = true;
					break;
				}
			}

			if (isnumpresent == false) {
				System.out.println("missing number is " + index);
				if (index > highestnum) {
					highestnum = index;

				}

			}
		}
		System.out.println("highest max num is " + highestnum);
		return highestnum;

	}

	public static void main(String[] args) {
		HighestMaxNum num = new HighestMaxNum();
		int[] arr = { 1, 3, 4, 7, 9, 10 };
		num.missNumber(arr);
	}

}
