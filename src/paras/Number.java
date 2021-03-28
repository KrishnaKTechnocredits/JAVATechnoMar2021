//1. WAP to find the square and cube of a number. 
//NOTE : one method to calculate square and another for cube.

/*
Assignment 2 - Program 1 - Program Statement : WAP to find the square and cube of a number. 
*/

package paras;

class Number{
	
	void square(int num){
		int ans = num*num;
		System.out.println("Square of number is " + ans);
	}
	
	void cube(int num){
		int ans = num*num*num;
		System.out.println("Cube of number is " + ans);
	}
	
	public static void main(String[] args){
		Number number = new Number();
		number.square(10);
		number.cube(10);
	}
}