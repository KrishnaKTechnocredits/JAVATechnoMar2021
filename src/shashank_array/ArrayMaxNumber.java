package shashank_array;

public class ArrayMaxNumber {

	int max;

	public void arrayMaxNumber(int[] arr) {
		max = arr[0];
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] > max) {
				max = arr[index];
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 100, 23, 67, 44, 23, 14, 23, 89, -23 };
		ArrayMaxNumber maxNumber = new ArrayMaxNumber();
		maxNumber.arrayMaxNumber(arr);
		System.out.println("Maximum number of array is " + maxNumber.max);
	}

}
