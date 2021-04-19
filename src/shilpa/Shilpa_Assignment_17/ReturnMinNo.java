/*Program 7: From given array return min number.
input : 22,35,65,88,11,23,45
output : 11
*/

package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class ReturnMinNo {

	void getMinNum(int[] numbers) {
		int minNo = numbers[0];
		for (int index = 0; index < numbers.length; index++) {

			if (minNo > numbers[index])
				minNo = numbers[index];

		}
		System.out.println("Minimum Number:-" + minNo);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] input1 = new int[5];
		ReturnMinNo returnMinNo = new ReturnMinNo();
		System.out.println("Enter Numbers");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		returnMinNo.getMinNum(input1);
		scanner.close();

	}
}
