/*Program 4: From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/

package rahul_Hiremath.assignment_17;

import java.util.Scanner;

public class Ass_17_4 {

	int count;
	int numFreq;

	void checkFrequency(int[] array, int num) {
		numFreq = num;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == num)
				count++;
		}
	}

	void displayFrequencyCount() {
		System.out.println("Frequency of " + numFreq + " is: " + count);
	}

	public static void main(String[] args) {
		Ass_17_4 ass_17_4 = new Ass_17_4();
		int[] array = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };
		System.out.println("Please enter which number to check the frequency");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		ass_17_4.checkFrequency(array, num);
		ass_17_4.displayFrequencyCount();
		scanner.close();
	}
}
