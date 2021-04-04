package dhanshri.Assignment_8;

public class DivisibleNumbers {

	void evenNum(int startNum, int endNum) {
		System.out.println("Even numbers are ");

		while (startNum <= endNum) {

			if (startNum % 2 == 0)
				System.out.println(startNum);
			startNum++;
		}

	}

	void divisableByNum5(int startNum, int endNum) {

		System.out.println("Divisable by 5 numbers are ");

		while (startNum <= endNum) {

			if (startNum % 5 == 0)
				System.out.println(startNum);
			startNum++;
		}

	}

	void divisableByNum5n3(int startNum, int endNum) {
		System.out.println("Number divisibale by 5 and 3 are :");
		while (startNum <= endNum) {
			if (startNum % 5 == 0 && startNum % 3 == 0)
				System.out.println(startNum);
			startNum++;
		}

	}

	void divisableByNum7n13(int startNum, int endNum) {

		System.out.println("Divisible  by 7 or 13, numbers are: ");

		while (startNum <= endNum) {
			if (startNum % 7 == 0)
				System.out.println(startNum + " Divisableby 7 ");
			else if (startNum % 13 == 0)
				System.out.println(startNum + " Divisableby 13");
			startNum++;
		}

	}

	public static void main(String[] args) {
		DivisibleNumbers divisibleNumbers = new DivisibleNumbers();
		divisibleNumbers.evenNum(10, 15);
		divisibleNumbers.divisableByNum5(10, 30);
		divisibleNumbers.divisableByNum5n3(5, 35);
		divisibleNumbers.divisableByNum7n13(5, 40);

	}

}
