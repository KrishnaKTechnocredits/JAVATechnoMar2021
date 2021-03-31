// *WAP to find the square and cube of a number.* 
//NOTE : one method to calculate square and another for cube.

package krati_Jain;

class Assignment2squarecube {
	
	void square(int num1) {
		int squareOp = num1 * num1;
		System.out.println("Square of the number is: " + squareOp);
	}
	
	void cube(int num2) {
		int cubeOp = num2 * num2 * num2;
		System.out.println("Square of the number is: " + cubeOp);
	}
	
	public static void main(String[] a) {
	Assignment2squarecube assignment2squarecube= new Assignment2squarecube();
	assignment2squarecube.square(8);
	assignment2squarecube.cube(11);
	}
		
}