/*1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.
*/
package aparna.assignment2;

class Calculation {

	void squareOfNumber(int num) {
		int squareOfNumber = num * num;
		System.out.println("square of a number:- " + squareOfNumber);

	}

	void cubeOfNumber(int num) {
		int cubeOfNumber = num * num * num;
		System.out.println("square of a number:- " + cubeOfNumber);
	}

	public static void main(String[] args) {
		Calculation calculation = new Calculation();
		calculation.squareOfNumber(2);
		calculation.cubeOfNumber(3);

	}
}