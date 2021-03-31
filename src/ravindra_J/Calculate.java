
/*	WAP to find the square and cube of a number. 
	NOTE : one method to calculate square and another for cube.
 */
package ravindra_J;
class Calculate{
	void square(int num1){
		int a = num1;
		int square = a*a;
		System.out.println("Square of the num1 > "+square);
	}
	void cube(int num1){
		int a = num1;
		int cube = a*a*a;
		System.out.println("Cube of the num1 > "+cube);
	}
	public static void main(String []args){
		Calculate calculate = new Calculate();
		calculate.square(56);
		calculate.cube(56);
	}

}