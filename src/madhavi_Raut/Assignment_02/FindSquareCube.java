/*Assignment 02
 Program 01
 WAP to find the square and cube of a number.
	NOTE : one method to calculate square and another for cube*/

package madhavi_Raut.Assignment_02;

class FindSquareCube {

	void findSquare(int num) {
		System.out.println("Square of given number is: " + num * num);
	}

	void findCube(int num) {
		System.out.println("Cube of given number is: " + num * num * num);
	}

	public static void main(String[] args) {
		FindSquareCube findSquareCube = new FindSquareCube();
		findSquareCube.findSquare(5);
		findSquareCube.findCube(5);
	}
}
