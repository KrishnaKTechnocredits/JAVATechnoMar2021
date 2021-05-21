package anubhav.arrayexamples;

/* Return Unique elements from given array. [30 mins max]
			input : {10,2,3,10,3,55,61,2};
			Output : {10,2,3,55,61}
			Hint : create new array Called output, insert eligible numbers and return output array.
			Hint : Method should take int array as parameter and return an array*/

public class ReturnUniqueArrayElements {

	int[] findUniqueElements(int[] input) {
		int[] output = new int[input.length];
		int count = 0;
		boolean isDuplicate;
		for (int index = 0; index < input.length; index++) { //10
			isDuplicate = false;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
					output[count] = input[index];
					count++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnUniqueArrayElements returnUniqueArrayElements = new ReturnUniqueArrayElements();
		int[] input = { 10, 2, 3, 10, 3, 55, 61, 2 };
		returnUniqueArrayElements.findUniqueElements(input);
		int[] output = returnUniqueArrayElements.findUniqueElements(input);
		for (int index = 0; index < output.length && output[index] != 0; index++)
			System.out.print(output[index] + " ");
	}
}
