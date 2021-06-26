package priyanka_Panat.coding_exam_22;

public class ArrayExam {
	static int getSum(int[] arr) {
		int sum = 0;
		boolean flag = true;
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] == 6) {
				flag = false;
			} else if (arr[index] == 9) {
				flag = true;
			} else if (arr[index] != 6 && flag) {
				sum = sum + arr[index];
			}
		}
		return sum;

	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 4, 5, 6, 12, 2, 9, 1, 3 };
		int[] arr3 = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		int[] arr4 = { 6, 1, 4, 5, 9 };
		int resultOfArr1 = getSum(arr1);
		int resultOfArr2 = getSum(arr2);
		int resultOfArr3 = getSum(arr3);
		int resultOfArr4 = getSum(arr4);
		System.out.println("Result of Array1 is :" + resultOfArr1);
		System.out.println("Result of Array2 is :" + resultOfArr2);
		System.out.println("Result of Array3 is :" + resultOfArr3);
		System.out.println("Result of Array4 is :" + resultOfArr4);

	}
}
