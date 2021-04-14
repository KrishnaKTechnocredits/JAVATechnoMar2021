package prachi.Assignment_17;

import java.util.Scanner;

/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 5*/

public class ArrNumberFrequency {

	int getNumFreq(int[] numberArr, int target) {
		int targetCnt = 0;
		for (int index = 0; index < numberArr.length; index++) {
			if (target == numberArr[index])
				targetCnt++;
		}
		return targetCnt;
	}

	public static void main(String[] args) {
		int[] numberArr = {10,23,23,44,23,10,23,4,23};
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter target number");
		int targetNumber = scanner.nextInt();
		ArrNumberFrequency numberFrequency = new ArrNumberFrequency();
		System.out.println("Frequency of "+targetNumber+" is : "+(numberFrequency.getNumFreq(numberArr,targetNumber)));
	}
}
