package shivani.Assignment_17;

import java.util.Scanner;

/*Program 3:  From given numbers, count the negative and positive numbers.
input : 10,23,26,-27,-88,87,-65 
output : negative -> 3
         positive -> 4*/
public class ArrayPositiveNum {
	void posNegNumber(int[] numList) {

		int countPositive = 0;

		for (int index = 0; index < numList.length; index++) {

			if (numList[index] >= 0) {
				countPositive++;
			}
		}
		System.out.println("Positive Number Count :" + countPositive);
		System.out.println("Negative Number Count :" + (numList.length - countPositive));

	}

	public static void main(String[] args) {
		ArrayPositiveNum arrPosNegnumber = new ArrayPositiveNum();
		Scanner listnum = new Scanner(System.in);
		System.out.println(" Please enter how many number you want to enter in list");
		int num = listnum.nextInt();
		System.out.println("please enter " + num + " numbers here");
		int[] number = new int[num];

		for (int i = 0; i < num; i++) {
			number[i] = listnum.nextInt();
		}
		arrPosNegnumber.posNegNumber(number);

	}

}
