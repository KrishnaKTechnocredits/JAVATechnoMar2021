/*Assignment - 17
Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/
package neha_Rathi.assignment17;

public class MinNumber {
	int minNum(int[] input) {
		int index = 0;
		int temp = input[0];
		for (; index < input.length; index++) {
			if (temp > input[index])
				temp = input[index];
		}
		return temp;
	}

	public static void main(String[] args) {
		MinNumber minNumber = new MinNumber();
		int[] input = { 22, 35, 65, 88, 11, 23, 45 };
		System.out.println("Minimum number is "+minNumber.minNum(input));
	}
}
