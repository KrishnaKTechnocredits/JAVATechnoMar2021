package monika.Practise1.Ass2;
/*Asignment2: 
1. WAP to find the square and cube of a number. 
NOTE : one method to calculate square and another for cube.*/
public class Test1 {
	int getSquareOfNumber(int inputNumber) {
		return inputNumber*inputNumber;
	}
	
	int getCubeOfNumber(int inputNumber) {
		return inputNumber*inputNumber*inputNumber;
	}

	public static void main(String[] args) {
		Test1 obj = new Test1();
		int squareResult = obj.getSquareOfNumber(2);
		int cubeResult = obj.getCubeOfNumber(3);
		System.out.println(squareResult);
		System.out.println(cubeResult);
	}

}
