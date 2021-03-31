package shivani;

class SquareCube {

	void square(int number) {
		int square = number * number;
		System.out.println("Square of a number " + square);
	}

	void cube(int number) {
		int cube = number * number * number;
		System.out.println("Cube of a number " + cube);
	}

	public static void main(String[] args) {
		SquareCube squareCube = new SquareCube();
		squareCube.square(5);
		squareCube.cube(4);
	}
}
