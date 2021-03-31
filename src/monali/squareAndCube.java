//program to find square and cube of a number.
package monali;

class squareAndCube{
	int num;
	
	void Square(int num){
	    int ans = num * num;
	    System.out.println("Square of number is" +ans);
	}
	
	void Cube(int num){
		int ans = num* num * num;
		System.out.println("Cube of a number is" +ans);
	}
	public static void main(String[] a){
		squareAndCube squareandcube = new squareAndCube();
		squareandcube.Square(3);
		squareandcube.Cube(4);
	}
		
}
