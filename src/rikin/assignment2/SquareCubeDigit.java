package rikin.assignment2;

class SquareCubeDigit{
	
	void square(int num1){
		int ans = num1 * num1;
		System.out.println("Square of " + num1 + " is " +ans);
	}
	
	void cube(int num1){
		int ans = num1 * num1 * num1;
		System.out.println("cube of " + num1 + " is " + ans);
	}
	
	public static void main (String [] args){
		SquareCubeDigit squareCubeDigit = new SquareCubeDigit();
		squareCubeDigit.square(5);
		squareCubeDigit.square(10);
		squareCubeDigit.cube(5);
		squareCubeDigit.cube(10);
	}
}