
//find the square and cube of a number

package prashant;

public class SquareCube {

	void square(int number) {
		int output = number * number;
		System.out.println("Square of Number 3 is : " + output);
	}

	void cube(int number) {
		int output = number * number * number;
		System.out.println("Cube of Number 6 is : " + output);
	}

	public static void main(String[] arg) {
		SquareCube sqcube = new SquareCube();
		sqcube.square(3);
		sqcube.cube(6);
	}

}
