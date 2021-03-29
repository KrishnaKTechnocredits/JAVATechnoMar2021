
/*Java Assignment 2: 22nd March 2021

1. WAP to find the square and cube of a number.
NOTE : one method to calculate square and another for cube.

 */

package vaibhav;

class NumOperations{
	
	void square (int num1){
		int sqAns = num1 * num1;
		System.out.println("Square of " + num1 + " is " + sqAns);
	}

	void cube (int num2){
		int cubeAns = num2 * num2 * num2;
		System.out.println("Cube of " + num2 + " is " + cubeAns);
	}
	
	public static void main (String[] args){
		NumOperations numOperations = new NumOperations();
		numOperations.square(3);
		numOperations.cube(9);
	}
}