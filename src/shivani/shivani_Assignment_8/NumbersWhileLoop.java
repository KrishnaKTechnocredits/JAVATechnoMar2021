package shivani.shivani_Assignment_8;

public class NumbersWhileLoop {

	int start;
	int endIndex;

	void evenNumbers(int start, int endIndex) {
		System.out.println("even number are : ");

		while (start <= endIndex) {
			if (start % 2 == 0) {
				System.out.println(start);
			}
			start++;
		}

	}

	void divisibleNumberFive(int start, int endIndex) {
		System.out.println("divisible by 5 ,numbers are  :");

		while (start <= endIndex) {
			if (start % 5 == 0) {
				System.out.println(start);
			}
			start++;

		}
	}

	void divisibleNumberFiveAndThree(int start, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are :");

		while (start <= endIndex) {
			if (start % 5 == 0 && start % 3 == 0) {
				System.out.println(start);
			}
			start++;
		}

	}

	void divisibleNumberSeven(int start, int endIndex) {

		while (start <= endIndex) {
			if (start % 7 == 0) {
				System.out.println(start + " is Divisible by 7");

			} else if (start % 13 == 0) {
				System.out.println(start + " is Divisible by 13");
			}
			start++;
		}

	}

	public static void main(String[] args) {
		NumbersWhileLoop numberWhileLoop = new NumbersWhileLoop();
		numberWhileLoop.evenNumbers(10, 15);
		numberWhileLoop.divisibleNumberFive(10, 30);
		numberWhileLoop.divisibleNumberFiveAndThree(5, 18);
		numberWhileLoop.divisibleNumberSeven(5, 40);
	}
}
