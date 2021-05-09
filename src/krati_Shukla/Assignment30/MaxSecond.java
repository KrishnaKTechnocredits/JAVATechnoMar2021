package krati_Shukla.Assignment30;

public class MaxSecond {

	void Max(int[] input) {

		for (int index = 0; index < input.length; index++) {
			for (int newIndex = 0; newIndex < input.length - 1; newIndex++) {
				if ((input[newIndex] < input[newIndex + 1])) {
					int temp = input[newIndex];
					input[newIndex] = input[newIndex + 1];
					input[newIndex + 1] = temp;
				}
			}
		}
		System.out.println("The secong biggest number is : "+input[1]);
	}

	public static void main(String[] a) {
		MaxSecond maxSecond = new MaxSecond();
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		maxSecond.Max(arr);
	}

}
