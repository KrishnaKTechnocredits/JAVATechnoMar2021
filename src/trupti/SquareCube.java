package trupti;
/*Assignment 2:WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.*/

class SquareCube {

	void square(int x){
		int square=x*x;
		System.out.println("Square of number "+x+" is: "+square);
	 }
	 void cube(int y){
		int cube=y*y*y;
		System.out.println("Cube of number "+y+" is: "+cube);
	 }
	 
	 public static void main(String[] args){
		SquareCube squarecube=new SquareCube();
		squarecube.square(5);
		squarecube.cube(3);
	 }
}
