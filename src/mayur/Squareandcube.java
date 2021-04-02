//WAP to find the square and cube of a number.
//NOTE : one method to calculate square and another for cube.

class SquareAndCube
{
	void square(int a)
	{
		int square= a*a;
		System.out.println("Square of a is " +square);
		
	}
	
	void cube(int a)
	{
		int cube=a*a*a;
		System.out.println("Cube of a is " +cube);
	
	}
	
	public static void main(String[] args)
	{
		SquareAndCube squareAndCube = new SquareAndCube();
		squareAndCube.square(10);
		squareAndCube.cube(10);
	}

	
}