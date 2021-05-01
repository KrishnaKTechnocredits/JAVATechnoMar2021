/*Assignment - 17
Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4
*/

package neha_Rathi.assignment17;

import java.util.Scanner;

public class NegativePositive {

	void countNegativePositive(int[] num) {		int positiveCount = 0;
		int negativeCount = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] >= 0)
				positiveCount++;
			else
				negativeCount++;
		}
		System.out.println("positive count is: " + positiveCount);
		System.out.println("Negative count is: " + negativeCount);
	}

	public static void main(String[] args) {
		NegativePositive negativePositive = new NegativePositive();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many nums you want to enter: ");
		int size = sc.nextInt();
		int[] inputNum = new int[size];
		for (int index = 0; index < inputNum.length; index++) {
			System.out.println("Enter no "+index);
			inputNum[index] = sc.nextInt();
		}
		negativePositive.countNegativePositive(inputNum);
	}
}
