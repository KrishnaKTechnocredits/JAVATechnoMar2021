/*
 * Assignment 4_1
 * Create a class named as NumberGame with following method.
 */
package neha_Rathi.assignment4;

class NumberGame {

	void findMaxNumber(int num1, int num2, int num3) {

		if (num1 > num2 && num1 > num3) {
			System.out.println("Maximum number found:" + num1);
		} else if (num2 > num3) {
			System.out.println("Maximum number found:" + num2);
		} else if (num1 == num2 && num2 == num3) {
			System.out.println("Maximum number could not found, All given numbers are equals");
		} else {
			System.out.println("Maximum number found:" + num3);
		}

	}

	void findMinNumber(int num1, int num2, int num3) {

		if (num1 < num2 && num1 < num3) {
			System.out.println("Minimum number found:" + num1);
		} else if (num2 < num3) {
			System.out.println("Minimum number found:" + num2);
		} else if (num1 == num2 && num2 == num3) {
			System.out.println("Minimum number could not found, All given numbers are equals");
		} else {
			System.out.println("Minimum number found:" + num3);
		}

	}

	public static void main(String[] args) {
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(13, 4, 19);
		numberGame.findMinNumber(13, 4, 19);
		numberGame.findMaxNumber(8, 8, 8);
		numberGame.findMinNumber(4, 4, 4);
	}
}