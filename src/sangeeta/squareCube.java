//WAP to find the square and cube of a number
// Note: Oe method to fine square and one method to find cube
package sangeeta;
class SquareCube{
	int num;
	void square(int num){
		int answer = num*num;
		System.out.println(" Square of a number is "+answer);
	}
	
	void cube(int num){
		int answer = num*num*num;
		System.out.println(" Cube of a number is "+answer);
	}
	
	public static void main(String[] a){
		SquareCube squareCube = new SquareCube();
		squareCube.square(10);
		squareCube.square(20);
		squareCube.square(30);
		squareCube.cube(10);
		squareCube.cube(20);
		squareCube.cube(30);
	}
}