//Write a program to find square and cube of a number. 
package pavan;
class SqAndCu{

	void square(int num1){
		int sq= num1*num1;
		System.out.println("Square of the number is "+ sq); 
	}
	
	void cube(int num1){
		int cu= num1*num1*num1;
		System.out.println("Cube of the number is "+cu);
	}
	public static void main (String[]args){
		SqAndCu sqAndCu= new SqAndCu();
		sqAndCu.square(6);
		sqAndCu.cube(6);
	}
}

