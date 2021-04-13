package shivani.Assignment_17;

import java.util.Scanner;

/*Program 7:  From given array return min number.
input : 22,35,65,88,11,23,45
output : 11*/
public class MinNumberArray {
	
	void minNumber(int[] mNumber) {

		int min = mNumber[0];
		for (int index = 0; index < mNumber.length; index++) {

			if (mNumber[index] < min)
				min = mNumber[index];

		}
		System.out.println("min number is " + min);
	}
public static void main(String[] args) {
	MinNumberArray MinNumberArray= new MinNumberArray();
	Scanner sc = new Scanner(System.in);
	System.out.println("please enter how many number you want to enter in list");

	int number = sc.nextInt();
	int[] num = new int[number];
	System.out.println("enter the list of " + number + "numbers");

	for (int list = 0; list < number; list++) {

		num[list] = sc.nextInt();
	}
	MinNumberArray.minNumber(num);
	
}
}
