package prashant.Coding_exam_22;

public class ArrSumSection69 {
	int numsum(int[] numarr) {
		int output = 0;
		boolean flag = false;
		for (int i = 0; i < numarr.length; i++) {
			if (numarr[i] == 6)
				flag = true;
			if (flag == false)
				output += numarr[i];
			if (numarr[i] == 9)
				flag = false;
		}
		return output;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = { 4, 5, 6, 12, 2, 9, 1, 3 };
		int[] arr3 = { 2, 1, 6, 9, 11, 6, 19, 12, 9, 2 };
		int[] arr4 = { 6, 1, 4, 5, 9 };

		int output1 = new ArrSumSection69().numsum(arr1);
		System.out.println(output1);

		int output2 = new ArrSumSection69().numsum(arr2);
		System.out.println(output2);

		int output3 = new ArrSumSection69().numsum(arr3);
		System.out.println(output3);

		int output4 = new ArrSumSection69().numsum(arr4);
		System.out.println(output4);
	}
}
