// 1. WAP to find the square and cube of a number. 
// NOTE : one method to calculate square and another for cube.
package anubhav;

class NumberOperations{
	void square(int num){
		int result= num*num;
		System.out.println("Square of the number is " + result);
	}
	
	void cube(int num){
		int result= num*num*num;
		System.out.println("Cube of the number is " + result);
	}
	
	public static void main(String[] args){
		NumberOperations numberOperations= new NumberOperations();
		numberOperations.square(5);
		numberOperations.cube(5);
	}
}