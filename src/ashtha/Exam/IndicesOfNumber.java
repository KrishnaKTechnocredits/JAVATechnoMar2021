package ashtha.Exam;

public class IndicesOfNumber {

	int[] getIndicesOfNumber(int[] number, int targetNum) {
		int[] output = new int[2];
		for (int index = number.length - 1; index >= 0; index--) {
			for (int innerIndex = 0; innerIndex < number.length; innerIndex++) {
				if ((number[index] + number[innerIndex]) == targetNum) {
					output[0] = index;
					output[1] = innerIndex;
					break;
				}
			}
		}
		return output;
	}

	public static void main(String[] args) {
		IndicesOfNumber indicesOfNumber = new IndicesOfNumber();
		int[] inputNumber = { 2, 11, 15, 7, 4 };
		int[] result = indicesOfNumber.getIndicesOfNumber(inputNumber, 9);
		for (int i = 0; i < 2; i++)
			System.out.println(result[i]);
	}
}
