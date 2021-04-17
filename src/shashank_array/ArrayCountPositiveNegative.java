package shashank_array;

public class ArrayCountPositiveNegative {

	int countZero = 0;

	public int countPositiveNegative(int[] arr) {
		int countPositive = 0;

		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 0) {
				countZero++;
			} else if (arr[index] > 0) {
				countPositive++;
			}
		}
		return countPositive;
	}

	public void displayPositiveNegativeNum(int cnt, int[] arr) {
		System.out.println("Count of positive number is " + cnt);
		System.out.println("count of negative number is " + (arr.length - cnt - countZero));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -10, 0, 0, 27, 88, -87, 65, -77, 89, 20 };
		ArrayCountPositiveNegative countNumber = new ArrayCountPositiveNegative();
		int cnt = countNumber.countPositiveNegative(arr);
		countNumber.displayPositiveNegativeNum(cnt, arr);
	}

}
