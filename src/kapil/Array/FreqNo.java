
/*program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23
output : Freq of 23 is 4
*/

package kapil.Array;

import java.util.Scanner;

public class FreqNo {

	void getFreqNum(int[] input) {
		int freqCount = 0;
		for (int index = 0; index < input.length; index++) {
			if (input[index] == 23)
				freqCount++;
		}
		System.out.println("Frequency  number count : " + freqCount);
	}

	public static void main(String[] args) {
		FreqNo freqNo = new FreqNo();
		Scanner scanner = new Scanner(System.in);
		System.out.println("How many number you want to enter ?");
		int size = scanner.nextInt();
		int[] num = new int[size];
		System.out.println("Enter numbers : ");
		for (int index = 0; index < num.length; index++) {
			num[index] = scanner.nextInt();

		}

		System.out.println("Target number : ");
		int no = scanner.nextInt();
		{
			freqNo.getFreqNum(num);
		}
	}
}
