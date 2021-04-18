package sandesh.Assignment_2;

public class SquareCube {
	
	void square(int num) {
		int square_num = (num * num);
		System.out.println("Square of number " + num + " is " + square_num);
	}
	
	void cube(int num) {
		int cube_num = (num * num * num);
		System.out.println("Square of number " + num + " is " + cube_num);
	}
	
	public static void main(String[] args) {
		SquareCube sc1 = new SquareCube();
		int number = 10;
		sc1.square(number);
		sc1.cube(number);
	}

}
