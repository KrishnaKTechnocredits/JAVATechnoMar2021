// From given numbers, return the frequency of target number.
//input : 10,23,23,44,23,10,23,4,23
//target number : 23         
//output : Freq. of 23 is 4

package prashant;

import java.util.Scanner;

public class ArrFreqNumber {

	void dispfreqcnt(int[] num1, int target) {
		int freqCnt = 0;
		for (int i = 0; i < num1.length; i++) {
			if (num1[i] == target)
				freqCnt++;
		}
		System.out.println("Frequency of Target No. Count  :" + freqCnt);
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
		System.out.println("Enter target Number:");
		int target = num.nextInt();
		new ArrFreqNumber().dispfreqcnt(num1, target);
		num.close();
	}
}
