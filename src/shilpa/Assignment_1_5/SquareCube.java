// Program to find the square and cube of a number

package shilpa.Assignment_1_5;

class SquareCube{

	void square(int a){
		int ans = a * a;
		System.out.println("Square is: "+ ans);
	}
	void cube(int b){
		int ans = b*b*b;
		System.out.println("Cube is: "+ ans);
	}
	public static void main(String[] arg){
		SquareCube sc1 = new SquareCube();
		sc1.square(5);
		sc1.cube(5);
	}
}
	