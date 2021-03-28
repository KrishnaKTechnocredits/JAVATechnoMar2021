package ashtha;

class SquareAndCubeRoot {

	void square(int num1){
		int sq = num1*num1;
		System.out.println("Square = "+sq);
	}
	
	void cube(int num2){
		int cub = num2*num2;
		System.out.println("Cube = "+cub);
	}
	
	public static void main (String[] a) {
		SquareAndCubeRoot squareAndCubeRoot = new SquareAndCubeRoot();
		squareAndCubeRoot.square(11);
		squareAndCubeRoot.cube(3);
	}
}