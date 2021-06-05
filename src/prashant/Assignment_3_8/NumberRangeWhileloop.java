// Assignment 8
package prashant.Assignment_3_8;

public class NumberRangeWhileloop {
	void dispAllEven(int strtindex, int endindx) {
		int i = strtindex;
		while (i <= endindx) {
			if (i % 2 == 0)
				System.out.println(i);
			i++;
		}
	}

	void dispDivBy5(int strtindex, int endindx) {
		int i = strtindex;
		while (i <= endindx) {
			if (i % 5 == 0)
				System.out.println(i);
		}
	}

	void dispDivBy5_3(int strtindex, int endindx) {
		int i = strtindex;
		while (i <= endindx) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
		}
	}

	void dispDivBy7_13(int strtindex, int endindx) {
		int i = strtindex;
		while (i <= endindx) {
			if (i % 7 == 0)
				System.out.println(i + " is Divisible by: 7");
			else if (i % 13 == 0)
				System.out.println(i + " is Divisible by:  13");
		}
	}

	public static void main(String[] args) {
		NumberRange numberrange = new NumberRange();
		System.out.println("Even numbers are:");
		numberrange.dispAllEven(10, 15);
		System.out.println();
		System.out.println("Divisible by 5, numbers are:");
		numberrange.dispDivBy5_3(10, 30);
		System.out.println();
		System.out.println("Divisible by 5 & 3, numbers are:");
		numberrange.dispDivBy5_3(5, 18);
		System.out.println();
		System.out.println("Divisible by 7 & 3, numbers are:");
		numberrange.dispDivBy7_13(5, 40);
	}
}
