/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/

package rashmi.Assignment_17;

import java.util.Scanner;

public class CntPositiveAndNegative {

	void positiveNegativeCnt(int[] num) {
		int positiveCnt = 0, negativeCnt = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == 0) {
				System.out.println(num[index] + " is neither postive nor negative number");
			} else if (num[index] > 0) {
				positiveCnt++;
			} else {
				negativeCnt++;

			}
		}
		System.out.println("Positive numbers count : " + positiveCnt);
		System.out.println("Negative numbers count : " + negativeCnt);

	}

	public static void main(String[] args) {
		CntPositiveAndNegative cntPositiveAndNegative = new CntPositiveAndNegative();
		Scanner s = new Scanner(System.in);
		System.out.println("How many numbers you want to enter ");
		int size = s.nextInt();
		int[] inputNum = new int[size];
		for (int index = 0; index < size; index++) {
			System.out.println("Enter the  number " + (index + 1));
			inputNum[index] = s.nextInt();
		}

		cntPositiveAndNegative.positiveNegativeCnt(inputNum);
		s.close();
	}
}
