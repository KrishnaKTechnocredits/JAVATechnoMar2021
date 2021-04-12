/*Assignment - 17
Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
*/
package neha_Rathi.assignment17;

import java.util.Scanner;

public class FrequencyNum {

	void frequencyCalculation(int[] num, int targetNum) {
		int count = 0;
		int tempNum = 0;
		for (int index = 0; index < num.length; index++) {
			if (num[index] == targetNum) {
				tempNum = num[index];
				count++;
			}
		}
		System.out.println("Freq of " + tempNum + " is " + count);
	}

	public static void main(String[] args) {
		FrequencyNum frequencyNum = new FrequencyNum();
		Scanner sc = new Scanner(System.in);
		System.out.println("How many numbers you want to enter: ");
		int size = sc.nextInt();
		int[] input = new int[size];
		for (int index = 0; index < input.length; index++) {
			System.out.println("Enter number " + index);
			input[index] = sc.nextInt();
		}
		System.out.println("Enter number for which we want to find frequency: ");
		int targetNum = sc.nextInt();
		frequencyNum.frequencyCalculation(input, targetNum);
	}

}
