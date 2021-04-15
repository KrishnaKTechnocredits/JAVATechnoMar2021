/*Program 3: From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65
output : negative -> 3
positive -> 4
*/
package kapil.Array;

import java.util.Scanner;

public class PosNegNo {
	void getPostiveNum(int[] input) {
		int postiveCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] > 0)
				postiveCount++;
		}
		{
			System.out.println("postive  number count : " + postiveCount);
			System.out.println("negitive number count : " + (input.length - postiveCount));
		}

	}

	public static void main(String[] args) {
		PosNegNo posnegno = new PosNegNo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to enter ?");
		int size = scanner.nextInt();
		int[] num = new int[size];

		for (int index = 0; index < num.length; index++) {
			System.out.println("Enter number : ");
			num[index] = scanner.nextInt();
		}
		{
			posnegno.getPostiveNum(num);
		}
	}
}