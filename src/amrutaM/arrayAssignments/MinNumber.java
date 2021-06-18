package amrutaM.arrayAssignments;

/*Array Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

public class MinNumber {

	int getMinNumber(int[] input) {
		int min = input[0];
		for (int index = 1; index < input.length; index++) {
			if (min > input[index]) {
				min = input[index];
			}
		}
		return min;
	}

	public static void main(String[] args) {
		MinNumber minNumber = new MinNumber();
		int numbers[] = { 22, 35, 65, 88, 11, 23, 45 };
		int minReceived = minNumber.getMinNumber(numbers);
		System.out.println("Minimum number is --> " + minReceived);
	}
}
