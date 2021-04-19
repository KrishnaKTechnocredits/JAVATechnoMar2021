/*
 * Assignment 8
 * While loop with start and end value fix
 */

package neha_Rathi.assignment8;

public class MathUtil {

	void evenOdd(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Even numbers are: ");
		while (num <= endRange) {
			if (num % 2 == 0)
				System.out.println(num);
			num++;
		}
	}

	void divisibleBy5(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Divisible by 5, numbers are: ");
		while (num <= endRange) {
			if (num % 5 == 0)
				System.out.println(num);
			num++;
		}
	}

	void divisibleBy5And3(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Divisible by 5 & 3, numbers are: ");
		while (num <= endRange) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println(num);
			num++;
		}
	}

	void divisibleBy7Or13(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Divisible by 7 or 13, numbers are: ");
		while (num <= endRange) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
			num++;
		}
	}

	public static void main(String[] args) {
		MathUtil mathUtil = new MathUtil();
		mathUtil.evenOdd(10, 15);
		mathUtil.divisibleBy5(10, 30);
		mathUtil.divisibleBy5And3(5, 18);
		mathUtil.divisibleBy7Or13(5, 40);
	}
}
