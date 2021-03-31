package aashay;
/*
 * WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.
 */
class SquareCube{
	int X;
	
	void square(int number){
		X = number*number;
		System.out.println("Square of a number is:"+X);
	}
	void cube(int number){
		X = number*number*number;
		System.out.println("Cube of a number is:"+X);
	}
	public static void main(String[] args){
		SquareCube sc = new SquareCube();
		sc.square(5);
		sc.cube(2);
	}
	
}