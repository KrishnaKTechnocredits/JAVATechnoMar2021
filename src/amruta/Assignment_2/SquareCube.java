/*  1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.  */

package amruta.Assignment_2;

class SquareCube{
	void Square(int a){
		int no1 = a*a;
		System.out.println("Square of No is : "+no1);
		
	}	
	void Cube(int a){
		int no2 = a*a*a;
		System.out.println("Cube of No is : "+no2);
	}		
	public static void main(String[] args){
		SquareCube sc = new SquareCube();
		sc.Square(9);	
		sc.Cube(3);
	}
}