////WAP to print factorial of 5

package sandesh.OWN_Practice_Sandesh_1;

public class FactorialRecursive {
	int x = 1;

	void getNum(int num) {
		x *= num;
		return;
	}

	int getFactorialOfNumber(int inputNumber) {
		while (inputNumber >= 1) {
			getNum(inputNumber);
			inputNumber--;
		}
		return x;
	}

	public static void main(String[] args) {
		int input = 5;
		int factorial = new FactorialRecursive().getFactorialOfNumber(input);
		System.out.println("Factorial of number " + input + " is -: " + factorial);
	}
}
