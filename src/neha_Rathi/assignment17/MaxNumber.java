/*Assignment - 17
Program 6:  From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/
package neha_Rathi.assignment17;

public class MaxNumber {

	int maxNum(int[] input) {
		int index = 0;
		int temp = input[0];
		for (; index < input.length; index++) {
			if (temp < input[index])
				temp = input[index];
		}
		return temp;
	}

	public static void main(String[] args) {
		MaxNumber maxNumber = new MaxNumber();
		int[] input = { 22, 35, 65, 88, 11, 23, 45 };
		System.out.println(maxNumber.maxNum(input));
	}
}
