/*
From given array return max number.
 */

package ami.Assignment_17;

public class MaxNumberCount {
	int maxNumberRtn(int[] arr) {
		int max = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (arr[index] > max)
				max = arr[index];
		}
		return max;
	}

	public static void main(String[] args) {
		int[] number = { 22, 35, 65, 88, 11, 23, 45 };
		MaxNumberCount mx = new MaxNumberCount();
		int max = mx.maxNumberRtn(number);
		System.out.println("Max Number :");
		System.out.println(max);
	}

}
