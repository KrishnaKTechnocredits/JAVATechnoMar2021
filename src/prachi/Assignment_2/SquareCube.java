package prachi.Assignment_2;

//Assignment_2_Program_1
//1. WAP to find the square and cube of a number. 
//NOTE : one method to calculate square and another for cube.

class SquareCube{
	int x=5;
	
	void square(int num1, int num2){
		int ans = x*x;
		System.out.println("square is "+ans);	
	}
    
	void cube(int num1, int num2, int num3){
		int ans = x*x*x;
		System.out.println("cube is "+ans);
	}

    public static void main(String[] args){
	  SquareCube squarecube = new SquareCube();
	  squarecube.square(5,5);
	  squarecube.cube(5,5,5);
    }
}