//1. WAP to find the square and cube of a number. 
//NOTE : one method to calculate square and another for cube.
package ankit.assignment_1_5;
class SquareAndCube{

	void square(int x){
		int square = x*x;
		System.out.println("Square of number "+ x + " is " + square);
	}
	
	void cube(int x){
	     int cube = x*x*x;
		 System.out.println("Cube of number "+ x + " is " + cube);
	}
	
	public static void main(String[] args){
		SquareAndCube squareAndCube = new SquareAndCube();
		squareAndCube.square(5);
		squareAndCube.cube(5);
	}
}