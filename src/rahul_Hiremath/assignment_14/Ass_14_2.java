package rahul_Hiremath.assignment_14;

import java.util.Scanner;

public class Ass_14_2 {

	double add(double a, double b) {
		double addAns = a + b;
		return addAns;
	}

	void sub(double a, double b) {
		double subAns = 0;
		if (a >= b) {
			subAns = a - b;
			System.out.println("Subtraction is: " + subAns);
		} else if (a < b)
			System.out.println("Num1 is smaller than Num2 subtration not");
	}

	double multi(double a, double b) {
		double multiAns = a * b;
		return multiAns;
	}

	double div(double a, double b) {
		double divAns = a / b;
		return divAns;
	}

	public static void main(String[] args) {

		Ass_14_2 ass_14_2 = new Ass_14_2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st no.");
		double num1 = sc.nextDouble();
		System.out.println("Enter 2nd no.");
		double num2 = sc.nextDouble();
		double addAns = ass_14_2.add(num1, num2);
		ass_14_2.sub(num1, num2);
		System.out.println("Addition is: " + addAns);
		double divAns = ass_14_2.div(num1, num2);
		System.out.println("Divison is: " + divAns);
		double multiAns = ass_14_2.multi(num1, num2);
		System.out.println("Multiplication is: " + multiAns);
		sc.close();
	}
}
