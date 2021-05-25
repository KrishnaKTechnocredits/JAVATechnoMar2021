/*2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
*/
package krati_Jain.codingExam8;

import java.util.Scanner;

public class Fibonacci8Numbers {

	public static void main(String[] args) {
		Fibonacci8Numbers fibonacci8Numbers = new Fibonacci8Numbers();
		Scanner scn = new Scanner(System.in);
		System.out.println("How many numbers you want to print in your Fibonacci series?");
		int count = scn.nextInt();
		fibonacci8Numbers.finonacci(count);
	}

	void finonacci(int count) {

		int fNum = 0;
		int lNum = 1;
		int nextNum = 0;
		System.out.println(fNum + "\n" + lNum);
		for (int i = 0; i < count - 2; i++) {
			nextNum = fNum + lNum;
			System.out.println(nextNum);
			fNum = lNum;
			lNum = nextNum;
		}

	}

}
