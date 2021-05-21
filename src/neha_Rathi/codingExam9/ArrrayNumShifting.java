package neha_Rathi.codingExam9;

public class ArrrayNumShifting {

	int[] shiftNum(int[] input) {
		int[] output = new int[input.length];
		int temp = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] != 0) {
				output[temp] = input[index];
				temp++;
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrrayNumShifting arrrayNumShifting = new ArrrayNumShifting();
		int[] arr = { 1, 3, 0, 3, 0, 6, 0, 9, 23, 45 };
		int[] res = arrrayNumShifting.shiftNum(arr);
		for (int index = 0; index < res.length; index++) {
			System.out.println(res[index]);
		}
	}
}
