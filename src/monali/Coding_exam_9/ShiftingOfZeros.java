package monali.Coding_exam_9;

public class ShiftingOfZeros {

	void zerosToEnd(int arr[], int n) {
		int count = 0;
		for (int index = 0; index < n; index++)
			if (arr[index] != 0)
				arr[count++] = arr[index];
		while (count < n)
			arr[count++] = 0;

	}

	public static void main(String[] args) {
		ShiftingOfZeros zero = new ShiftingOfZeros();
		int arr[] = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int n = arr.length;
		zero.zerosToEnd(arr, n);
		for (int i = 0; i < n; i++)
			System.out.println(arr[i] + " ");
	}
}
