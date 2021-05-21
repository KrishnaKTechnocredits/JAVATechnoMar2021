package kangan.assignments.assignment_30;

/*WAP to find Second max from given array
int[] arr = {10,33,43,55,97,11,3};
ouput : 55 */

public class SecondMax {

	int returnSecondMax(int[] input) {
		int max = input[0];
		int secondMax = 0;
		for (int index = 0; index < input.length; index++) {

			if (max < input[index]) {
				secondMax = max;
				max = input[index];

			}
		}
		return secondMax;

	}

	public static void main(String[] args) {
		SecondMax secondMax = new SecondMax();
		int[] arr = { 10, 33, 43, 55, 97, 11, 3 };
		int output = secondMax.returnSecondMax(arr);
		System.out.println(output);
	}
}
