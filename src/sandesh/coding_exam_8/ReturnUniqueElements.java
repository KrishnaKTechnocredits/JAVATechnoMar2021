package sandesh.coding_exam_8;

public class ReturnUniqueElements {

	private int[] getUniqueElementsArray(int[] input) {
		int[] uniqueArray = new int[input.length];
		int uniqueArrayIndex = 0;
		int returningArrayCount = 0;
		for (int index = 0; index < input.length; index++) {
			int duplicateElementCount = 0;
			for (int innerIndex = 0; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					duplicateElementCount++;
				}
			}
			if (duplicateElementCount == 1) {
				uniqueArray[uniqueArrayIndex] = input[index];
				uniqueArrayIndex++;
			}
		}
		for (int index = 0; index < uniqueArray.length; index++) {
			if (uniqueArray[index] != 0)
				returningArrayCount++;
		}
		int[] returningArray = new int[returningArrayCount];
		int placeCount = 0;
		for (int index = 0; index < uniqueArray.length; index++) {
			if (uniqueArray[index] != 0) {
				returningArray[placeCount] = uniqueArray[index];
				placeCount++;
			}
		}
		return returningArray;
	}

	public static void main(String[] args) {
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] returnedUniqueArray = new ReturnUniqueElements().getUniqueElementsArray(input);
		System.out.println("Unique elements in given array are -: ");
		for (int index = 0; index < returnedUniqueArray.length; index++) {
			System.out.println(returnedUniqueArray[index]);
		}
	}
}
