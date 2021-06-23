package amrutaM.arrayAssignments;

/*Array Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/
public class MaxNumber {

	int getMaxNumber(int[] numbers) {
		int max = numbers[0];
		for (int index = 1; index < numbers.length; index++) {
			if (max < numbers[index]) {
				max = numbers[index];
			}
		}
		return max;
	}

	public static void main(String[] args) {
		MaxNumber maxNumber = new MaxNumber();
		int[] input = { 22, 35, 65, 88, 11, 23, 45 };
		int max = maxNumber.getMaxNumber(input);
		System.out.println("Maxiumum number is --> " + max);
	}
}
