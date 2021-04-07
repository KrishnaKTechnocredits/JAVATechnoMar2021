package neha_Rathi;

public class Number {

	void evenOdd(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Even numbers are: ");
		for (; num <= endRange; num++) {
			if (num % 2 == 0)
				System.out.println(num);
		}
	}

	void divisibleBy5(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Divisible by 5, numbers are: ");
		for (; num <= endRange; num++) {
			if (num % 5 == 0)
				System.out.println(num);
		}
	}

	void divisibleBy5And3(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Divisible by 5 & 3, numbers are: ");
		for (; num <= endRange; num++) {
			if (num % 5 == 0 && num % 3 == 0)
				System.out.println(num);
		}
	}

	void divisibleBy7Or13(int startRange, int endRange) {
		int num = startRange;
		System.out.println("Divisible by 7 or 13, numbers are: ");
		for (; num <= endRange; num++) {
			if (num % 7 == 0)
				System.out.println(num + " is divisible by 7");
			if (num % 13 == 0)
				System.out.println(num + " is divisible by 13");
		}
	}

	public static void main(String[] args) {
		Number number = new Number();
		number.evenOdd(10, 15);
		number.divisibleBy5(10, 30);
		number.divisibleBy5And3(5, 18);
		number.divisibleBy7Or13(5, 40);
	}
}
