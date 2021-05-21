/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
*/
package shilpa.Shilpa_Assignment_17;

import java.util.Scanner;

public class FrequencyOfNum {
	int cnt;

	int getFreqOfNumber(int[] numbers, int targetno) {
		for (int index = 0; index < numbers.length; index++) {
			if (targetno == numbers[index])
				cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FrequencyOfNum frequencyOfNum = new FrequencyOfNum();

		int[] input1 = new int[6];
		int targetno;
		System.out.println("Enter any five Numbers");
		for (int index = 0; index < input1.length; index++) {
			input1[index] = scanner.nextInt();
		}
		System.out.println("Enter target no");
		targetno = scanner.nextInt();
		int output = frequencyOfNum.getFreqOfNumber(input1, targetno);
		System.out.println("Frequence of " + targetno + "is " + output);
		scanner.close();
	}

}
