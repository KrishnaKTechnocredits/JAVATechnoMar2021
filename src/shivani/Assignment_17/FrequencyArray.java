package shivani.Assignment_17;

import java.util.Scanner;

/*Program 4:  From given numbers, return the frequency of target number.
input : 10,23,23,44,23,10,23,4,23
target number : 23         
output : Freq of 23 is 4*/
public class FrequencyArray {

	void frequency(int number) {
		int frequency = 0;
		int[] numList = { 10, 23, 23, 44, 23, 10, 23, 4, 23 };

		for (int index = 0; index < numList.length; index++) {

			if (numList[index] == number)

				frequency++;

		}
		System.out.println("Frequency of given number " + number + " is " + frequency);
	}

	public static void main(String[] args) {

		FrequencyArray frequencyArray = new FrequencyArray();
		System.out.println("enter the number on which you want to check frequency");
		Scanner fnumber = new Scanner(System.in);
		int num = fnumber.nextInt();
		frequencyArray.frequency(num);
	}
}
