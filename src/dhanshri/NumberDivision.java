package dhanshri;

public class NumberDivision {
	int numbers;

	void evenNumbers(int startNum, int endNum) {
		System.out.println("Even numbers are ");
		for (numbers = startNum; numbers <= endNum; numbers++) {
			if (numbers % 2 == 0) {
				System.out.println(numbers);

			}

		}

	}

	void divisableby5(int startNum, int endNum) {

		System.out.println("Divisable by 5 numbers are ");
		for (numbers = startNum; numbers <= endNum; numbers++) {
			if (numbers % 5 == 0) {
				System.out.println(numbers);
			}

		}

	}

	void divisableby5n3(int startNum, int endNum) {

		for (numbers = startNum; numbers <= endNum; numbers++) {
			if (numbers % 5 == 0 && numbers % 3 == 0) {
				System.out.println("Divisableby 5 and 3 numbers is " + numbers);
			}

		}

	}

	void divisableby7n13(int startNum, int endNum) {
         
		System.out.println("Divisible  by 7 or 13, numbers are: ");
		for (numbers = startNum; numbers <= endNum; numbers++) {
			if (numbers % 7 == 0) {
				System.out.println(numbers + " Divisableby 7 ");
			} else if (numbers % 13 == 0)
				System.out.println(numbers + " Divisableby 13");

		}

	}

	public static void main(String[] args) {
		NumberDivision numberDivision = new NumberDivision();
		numberDivision.evenNumbers(10, 15);
		numberDivision.divisableby5(10, 30);
		numberDivision.divisableby5n3(5, 18);
		numberDivision.divisableby7n13(5, 40);
	}

}
