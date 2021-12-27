package vaibhav.SelfStudy;

public class Assignment_6 {

	void evenNumbers(int startIndex, int endIndex) {
		System.out.println("Even Numbers in the given range of " + startIndex + " - " + endIndex + " are as below : ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " , ");
			}
		}
	}

	void divisibleByFive(int startIndex, int endIndex) {
		System.out.println("");
		System.out.println("");
		System.out.println("Numbers whcih are divisible by 5 in the given range of " + startIndex + " - " + endIndex
				+ " are as below : ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 5 == 0) {
				System.out.print(i + " , ");
			}
		}
	}

	void divisibleByFiveAndThree(int startIndex, int endIndex) {
		System.out.println("");
		System.out.println("");
		System.out.println("Numbers whcih are divisible by 5 & 3 in the given range of " + startIndex + " - " + endIndex
				+ " are as below : ");
		for (int i = startIndex; i <= endIndex; i++) {
			if ((i % 5 == 0) && (i % 3 == 0)) {
				System.out.print(i + " , ");
			}
		}
	}

	void divisibleBySevenAndThirteen(int startIndex, int endIndex) {
		System.out.println("");
		System.out.println("");
		System.out.println("Numbers whcih are divisible by 7 or 13 in the given range of " + startIndex + " - "
				+ endIndex + " are as below : ");
		for (int i = startIndex; i <= endIndex; i++) {
			if (i % 7 == 0)
				System.out.println(i + " is divisible by 7 ");
			else if (i % 13 == 0)
				System.out.println(i + " is divisible by 13 ");
		}
	}

	public static void main(String[] args) {
		Assignment_6 assignment_6 = new Assignment_6();
		assignment_6.evenNumbers(10, 15);
		assignment_6.divisibleByFive(10, 30);
		assignment_6.divisibleByFiveAndThree(5, 18);
		assignment_6.divisibleBySevenAndThirteen(5, 40);
	}
}
