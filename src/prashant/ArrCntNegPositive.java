//From given numbers, count the negative and positive numbers.
//input : 10,23,26,-27,-88,87,-65 
//output : negative -> 3
//         positive -> 4

package prashant;

import java.util.Scanner;

public class ArrCntNegPositive {

	void dispPosNeg(int[] num1) {
		int NegativeCnt = 0, PositiveCnt = 0;

		for (int i = 0; i < num1.length; i++) {
			if (num1[i] > 0)
				PositiveCnt++;
			else
				NegativeCnt++;
		}
		System.out.println("Count of Positive Numbers  :" + PositiveCnt);
		System.out.println("Count of Negative Numbers  :" + NegativeCnt);
	}

	public static void main(String[] args) {

		Scanner num = new Scanner(System.in);
		System.out.println("Enter Size of  Array:");
		int temp = num.nextInt();
		int[] num1 = new int[temp];
		System.out.println("Enter" + " " + temp + " " + "Integers Numbers:");

		for (int i = 0; i < temp; i++) {
			num1[i] = num.nextInt();
		}
		new ArrCntNegPositive().dispPosNeg(num1);
		num.close();
	}
}
