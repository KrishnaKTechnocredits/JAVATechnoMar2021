/*
 Assignment 2_1
 WAP to find the square and cube of a number.
 */
package neha_Rathi;

class NumOperation {
	void square(int num) {
		System.out.println("Sqaure of number is: " + num * num);
	}

	void cube(int num) {
		System.out.println("Cube of number is: " + num * num * num);
	}

	public static void main(String[] args) {
		NumOperation numOperation = new NumOperation();
		numOperation.square(4);
		numOperation.cube(4);
	}
}