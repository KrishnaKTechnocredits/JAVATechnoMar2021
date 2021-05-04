package shashank.coding_exam1;

public class DiffFamilyYoungerOlderAge {

	public int[] calculateYoungerOlderAge(int[] arr) {
		for (int index = 0; index < arr.length; index++) {
			for (int index1 = index + 1; index1 < arr.length; index1++) {
				int temp = 0;
				if (arr[index] > arr[index1]) {
					temp = arr[index];
					arr[index] = arr[index1];
					arr[index1] = temp;
				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 7, 12, 56, 62, 25 };
		DiffFamilyYoungerOlderAge familyYongerOlderAge = new DiffFamilyYoungerOlderAge();
		int[] targetArray = familyYongerOlderAge.calculateYoungerOlderAge(array);
		System.out.println("Difference between older and younger age of family is "
				+ (targetArray[targetArray.length - 1] - targetArray[0]));
	}

}
