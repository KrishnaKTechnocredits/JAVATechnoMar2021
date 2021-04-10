package krishna.Assignment_14;
import java.util.Scanner;

public class CalculatorScanner {
	static int x;
	static int y;
	void add(int x, int y) {
		int answer = x + y;
		System.out.println("addition is " + answer);
	}

	void sub(int x, int y) {
		int answer = x - y;
		System.out.println("substraction is " + answer);
	}

	void mul(int x, int y) {
		int answer = x * y;
		System.out.println("multiplication is " + answer);
	}

	void division(int x, int y) {
		int answer = x / y;
		System.out.println("division is " + answer);
	}

	public static void main(String[] args) {
		CalculatorScanner calculatorScanner = new CalculatorScanner();
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter two numbers for addition :");
		x = scanner.nextInt();
		y = scanner.nextInt();
		calculatorScanner.add(x,y);
		
		System.out.println("Enter two numbers for substraction :");
		x = scanner.nextInt();
		y = scanner.nextInt();
		calculatorScanner.sub(x,y);
		
		System.out.println("Enter two numbers for multiplication :");
		x = scanner.nextInt();
		y = scanner.nextInt();
		calculatorScanner.mul(x,y);
		
		System.out.println("Enter two numbers for division :");
		x = scanner.nextInt();
		y = scanner.nextInt();
		calculatorScanner.division(x,y);

	}
}
