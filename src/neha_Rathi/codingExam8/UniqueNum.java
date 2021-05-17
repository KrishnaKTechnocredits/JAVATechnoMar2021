package neha_Rathi.codingExam8;

public class UniqueNum {
	static int temp = 0;

	int[] uniqueNum(int[] input) {

		int[] output = new int[input.length];
		int count = 0;
		for (int index = 0; index < input.length; index++) {

			boolean isUnique = true;
			for (int innerIndex = index + 1; innerIndex < input.length; innerIndex++) {
				if (input[index] == input[innerIndex]) 
					isUnique = false;
			}
			if (isUnique) {
				output[temp] = input[index];
				temp++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		UniqueNum uniqueNum = new UniqueNum();
		int[] arr = { 10, 2, 3, 10, 3, 55, 61, 2 };
		int[] res = uniqueNum.uniqueNum(arr);
		for (int index = 0; index < temp; index++) {
			System.out.println(res[index]);
		}
	}
}
