/*
 * Assignment 8
 * While loop with start and end value not fixed
 */

package neha_Rathi.assignment8;

public class MathUtil1 {

	void evenOdd(int totalNumber) {
		int count = 1;
		int num = 10;
		System.out.println("Even numbers are: ");
		while (count <= totalNumber) {
			if (num % 2 == 0) {
				System.out.println(count + ":" + num);
				count++;
			}
			num++;
		}
	}

	void divisibleBy5(int totalNumber) {
		int count = 1;
		int num = 10;
		System.out.println("Divisible by 5, numbers are: ");
		while (count <= totalNumber) {
			if (num % 5 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
		}
	}

	void divisibleBy5And3(int totalNumber) {
		int count = 1;
		int num = 5;
		System.out.println("Divisible by 5 & 3, numbers are: ");
		while (count <= totalNumber) {
			if (num % 5 == 0 && num % 3 == 0) {
				System.out.println(num);
				count++;
			}
			num++;
		}

	}

	void divisibleBy7Or13(int totalNumber) {
		int count = 1;
		int num = 5;
		System.out.println("Divisible by 7 or 13, numbers are: ");
		while (count <= totalNumber) {
			if (num % 7 == 0 && num % 13 == 0) {
				System.out.println(num + " Number is divisible by 7 and 13");
				count++;
				num++;
			} else if (num % 7 == 0) {
				System.out.println(num + " Number is Divisible by 7");
				count++;
				num++;
			} else if (num % 13 == 0) {
				System.out.println(num + " Number is Divisible by 13");
				count++;
				num++;
			} else {
				num++;
			}
		}
	}

	public static void main(String[] args) {
		MathUtil1 mathUtil1 = new MathUtil1();
		mathUtil1.evenOdd(3);
		mathUtil1.divisibleBy5(5);
		mathUtil1.divisibleBy5And3(1);
		mathUtil1.divisibleBy7Or13(19);
	}
}
