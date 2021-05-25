package sai.coding_exam8;

public class UniqueNumber {

	int[] numbers(int[] arr) {
		int[] output = new int[arr.length];
		int count = 0;
		boolean isUnique;
		for (int index = 0; index < arr.length; index++) {
			isUnique = false;
			for (int innerIndex = index + 1; innerIndex < arr.length; innerIndex++) {
				if (arr[index] == arr[innerIndex]) {
					isUnique = true;
				}
			}
			if (!isUnique) {
				output[count] = arr[index];
				count++;
			}

		}
		return output;
	}

	public static void main(String[] args) {
		int arrayWithDuplicates[] = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] output = new UniqueNumber().numbers(arrayWithDuplicates);
		for (int index = 0; index < output.length && output[index] != 0; index++)
			System.out.println(output[index]);
	}
}
