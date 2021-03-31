
package krati_Jain;

class NumberGame {
	
	void findMaxNumber(int num1, int num2, int num3) {
		if (num1 > num2 && num1 > num3){
			System.out.println("Maximum number is " + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("Maximum number is " + num2);
		}else if (num3 > num1 && num3 > num2) {
			System.out.println("Maximum number is " + num3);
		//else if ((num1 == num2) && (num2 == num3) && (num3 == num1))
		}else {
			System.out.println("Maximum number could not found, All given numbers are identical");
		}
	}
	
	void findMinNumber(int num4, int num5, int num6) {
		if (num4 < num5 && num4 < num6) {
			System.out.println("Minimum number is " + num4);
		}else if (num5 < num4 && num5 < num6) {
			System.out.println("Minimum number is " + num5);
		}else if (num6 < num4 && num6 < num5) {
			System.out.println("Minimum number is " + num6);
		//else if (num4 == num5 && num5 == num6 && num6 == num4);
		}else {
			System.out.println("Minimum number could not found, All given numbers are identical");
		}
	}
	
	public static void main(String[] a) {
		NumberGame numberGame = new NumberGame();
		numberGame.findMaxNumber(8, 163, 99);
		numberGame.findMinNumber(19, 19, 19);
	}
}