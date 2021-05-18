package mayur.assignment30;

public class MaxNumber {
	void getMaxNumber(int[] input) {
		int maxNumber1 = input[0];
		int maxNumber2 = input[1];
		for (int index = 0; index < input.length; index++) {
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] < input[innerIndex]) {
					maxNumber1 = input[innerIndex];
					maxNumber2 = input[index];
				}

			}
		}

		System.out.println("Maximum number in the array is: " + maxNumber1);
		System.out.println("Second maximum number in the array is: " + maxNumber2);
	}

	public static void main(String[] args) {
		MaxNumber max = new MaxNumber();
		int input[] = { 10, 33, 43, 55, 97, 11, 3 };
		max.getMaxNumber(input);
	}
}
