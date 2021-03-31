package monika;

/*Asignment2: 
 1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.*/

class Number{
void square(int square){
	int answer = square*square;
	System.out.println("Square of given no. is: " + answer);
}

void cube(int cube){
	int answer = cube*cube*cube;
	System.out.println("Cube of given no. is: " + answer);
}

public static void main(String[] args){
	Number number = new Number();
	number.square(4);
	number.cube(2);
}
}

