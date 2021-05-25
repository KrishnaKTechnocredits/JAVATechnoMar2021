package sandesh.OWN_Practice_Sandesh_1;

public class FactorialUsingWhile {
	int factorial = 1;

	int getFactorialOfNumber(int inputNumber) {
		while (inputNumber >= 1) {
			factorial *= inputNumber;
			inputNumber--;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int input = 0;
		int factorial = new FactorialUsingWhile().getFactorialOfNumber(input);
		System.out.println("Factorial of number " + input + " is -: " + factorial);
	}
}
