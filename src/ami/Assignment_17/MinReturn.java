/*
 From given array return min number
 */

package ami.Assignment_17;

public class MinReturn {
	int MinRtrn(int[] arr) {
		int min = arr[0];
		for (int index = 1; index < arr.length; index++) {
			if (arr[index] < min)
				min = arr[index];
		}
		return min;
	}

	public static void main(String[] args) {
		int[] number = { 22, 35, 65, 88, 11, 23, 45 };
		int min = new MinReturn().MinRtrn(number);
		System.out.println("Min Number :");
		System.out.println(min);
	}

}
