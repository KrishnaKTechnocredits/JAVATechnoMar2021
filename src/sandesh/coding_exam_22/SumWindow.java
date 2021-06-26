package sandesh.coding_exam_22;

public class SumWindow {

	private int getReturnSum(int[] inpArr) {
		int sum = 0;
		for (int index = 0; index < inpArr.length; index++) {
			if (inpArr[index] >= 6 && inpArr[index] <= 9) {
				do {
					index++;
				} while (inpArr[index] != 9);
			} else
				sum += inpArr[index];
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] input = { 6, 1, 4, 5, 9 };
		int ansSum = new SumWindow().getReturnSum(input);
		System.out.println(ansSum);
	}
}
