/*Assignment no 2
WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube */

package pravin.Assignment2;
class squareCube {

	void square(int Num1){
		int  a = Num1;
		int square = a * a;

		System.out.println("Square is " +square);
	}

	void cube(int Num1){
		int  a = Num1;
		int cube = a * a * a;

		System.out.println("Cube is " +cube);
	}

	public static void main(String[] args){
		squareCube squareCube1 = new squareCube();
		squareCube1.square(5);
		squareCube1.cube(5);
	}

}
