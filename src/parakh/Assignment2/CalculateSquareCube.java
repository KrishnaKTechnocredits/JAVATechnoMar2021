/*1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube. */

package parakh.Assignment2;

public class CalculateSquareCube {
	
	void calculateSquare(int num) {
		System.out.println("Square of given number is: " + num * num);
	}
	
	void calculateCube(int num) {
		System.out.println("Cube of given number is: " + num * num * num);	
	}
	
	public static void main(String args[]) {
		CalculateSquareCube squareCube = new CalculateSquareCube();
		squareCube.calculateSquare(10);
		squareCube.calculateCube(10);
	}
}
