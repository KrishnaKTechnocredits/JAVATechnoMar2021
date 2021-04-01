//Assignment 2- To find the square and cube of a number

package radha;

class Square{	
	void squareCalc(int x){
		int square = x*x;
		System.out.println("Square of the given number is:" + square);
	}
	
	void cubeCalc(int x){
		int cube = x*x*x;
		System.out.println("Cube of the given number is:" + cube);
	}
	
	public static void main(String[] args){
		Square square1 = new Square();
		square1.squareCalc(3);
		square1.cubeCalc(2);
	}	
}
