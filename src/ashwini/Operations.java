//WAP to find square and cube of a number.

package ashwini;

class Operations{
	
	int number, square , cube;
	void squareNumber(int num){
		number = num ;
		square = num*num;
	}
	
	void cubeNumber(int num){
		number = num;
		cube = num*num*num;
	}
	
	void display(){
		System.out.println("square of number :"+ square);
		System.out.println("cube of number :"+ cube);
	}
	
	public static void main(String args[]){
		Operations operation = new Operations();
		operation.squareNumber(3);
		operation.cubeNumber(2);
		operation.display();
	}
}
	
	