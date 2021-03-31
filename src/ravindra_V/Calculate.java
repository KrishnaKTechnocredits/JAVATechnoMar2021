//Assign2- program1 WAP to find square and cube

package ravindra_V;

class Calculate{
	int num1 = 4;
		void square(){
		int answer = num1 * num1;
		System.out.println("Square of 4 is " + answer);
	}

	void cube(){
		int answer = num1 * num1 * num1;
		System.out.println("Cube of 4 is " + answer);
	}
	
	public static void main(String[] args){
		Calculate c1 = new Calculate();
		c1.square();
		c1.cube();
	}
}	