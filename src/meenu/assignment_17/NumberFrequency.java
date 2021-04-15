package meenu.assignment_17;

/*From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4
*/

import java.util.Scanner;

public class NumberFrequency {

	int getFrequencyOfNum(int[] arrayOfNumber, int target) {
		int targetCount = 0;
		for (int index = 0; index < arrayOfNumber.length; index++) {
			if (target == arrayOfNumber[index])
				targetCount++;
		}
		return targetCount;
	}

	public static void main(String[] args) {
		int[] arrayOfNumbers = {10,23,23,44,23,10,23,4,23};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter target number : ");
		int targetNumber = scanner.nextInt();
		NumberFrequency numberFrequency = new NumberFrequency();
		System.out.println("frequency of "+targetNumber+" in given array is :"+(numberFrequency.getFrequencyOfNum(arrayOfNumbers,targetNumber)));
	}

}
