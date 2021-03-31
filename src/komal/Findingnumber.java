//WAP to find the square and cube of a number. 
//NOTE : one method to calculate square and another for cube.

package komal;

class Findingnumber{
	
	void Square(int num1){
		int ans = num1*num1;
		System.out.println("Square is " +ans);
	}
	void Cube(int num1){
		int ans1 = num1*num1*num1*num1; 
		System.out.println("Cube is " +ans1);
	}
	public static void main(String[] args){
		Findingnumber finding_number1 = new Findingnumber();
		finding_number1.Square(2);
		finding_number1.Cube(5);
	}
}