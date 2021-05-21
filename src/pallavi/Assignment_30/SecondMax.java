package pallavi.Assignment_30;

public class SecondMax {
	/*
	 * WAP to find Second max from given array int[] arr = {10,33,43,55,97,11,3};
	 * ouput : 55
	 */

	void secondMax(int array[]) { 
		int temp = 0;
		int innerIndex, index;
		for (index = 0; index < array.length; index++) {
			for (innerIndex = index + 1; innerIndex < array.length; innerIndex++) {
				if (array[index] < array[innerIndex]) {
					temp = array[index];
					array[index] = array[innerIndex];
					array[innerIndex] = temp;
				}
			}

		}

		System.out.println("second highest no is :" + array[1]);

	}

	public static void main(String[] args) {
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		new SecondMax().secondMax(arr);
	}

}
