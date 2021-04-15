/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
*/
package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class CountNegativeAndPositiveNos {
	int negativecnt;
	int positivecnt;

	void getCntOfNegativeandPossitiveNos(int[] numbers) {
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] < 0)
				negativecnt++;
			else
				positivecnt++;
		}
		System.out.println("Negative Numbers:-" + negativecnt + "\n Positive Numbers:- " + positivecnt);

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountNegativeAndPositiveNos countNegativeAndPositiveNos = new CountNegativeAndPositiveNos();
		int[] input1 = new int[6];
		System.out.println("Enter Numbers:-");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		countNegativeAndPositiveNos.getCntOfNegativeandPossitiveNos(input1);
		scanner.close();

	}
}
