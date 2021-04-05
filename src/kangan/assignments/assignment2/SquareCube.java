package kangan.assignments.assignment2;

public class SquareCube {

	void square(int x) {
		 int y=x*x;
		 System.out.println("Square of " + x + " is " + y);
	}
	void cube(int x) {
		int y=x*x*x;
		System.out.println("Cube of " + x + " is " + y);
	}
	public static void main(String[] args) {
		SquareCube squareCube = new SquareCube();
		squareCube.square(5);
		squareCube.cube(6);
	}
}
