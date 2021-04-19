/*Program 6: From given array return max number.
input : 22,35,65,88,11,23,45
output : 88
*/

package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class ReturnMaxNo {

	void getMaxNum(int[] numbers) {
		int maxno = 0;
		for (int index = 0; index < numbers.length; index++) {

			if (maxno < numbers[index])
				maxno = numbers[index];

		}
		System.out.println("Maximum Number:-" + maxno);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] input1 = new int[5];
		ReturnMaxNo returnMaxNo = new ReturnMaxNo();
		System.out.println("Enter Numbers");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		returnMaxNo.getMaxNum(input1);
		scanner.close();

	}
}
