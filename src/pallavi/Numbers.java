package pallavi;

public class Numbers {

	public static void main(String[] args) {
		Methods method = new Methods();
		method.evenNumber(10, 15);
		method.divisibleBy5(10, 30);
		method.divisibleByFiveAndThree(5, 18);
		method.divisibleBy7And13(5,40);


	}

	void evenNumber(int start, int end) {
		System.out.println("Even nubers are : ");
		int i = start;
		while (i <= end) {
			if (i % 2 == 0)
				System.out.println(i);
		}
		i++;

	}

	void divisibleBy5(int start, int end) {
		System.out.println("Divisible by 5 nubers are : ");
		int i = start;
		while (i <= end) {
			if (i % 5 == 0)
				System.out.println(i);
		}
		i++;

	}

	void divisibleByFiveAndThree(int start, int end) {
		System.out.println("Divisible by 5 & 3 nubers are : ");
		int i = start;
		while (i <= end) {
			if (i % 5 == 0 && i % 3 == 0)
				System.out.println(i);
		}
		i++;
	}

	void divisibleBy7And13(int start, int end) {
		int i = start;
		while (i <= end) {
			if (i % 7 == 0) {
				System.out.println(i + " is divisible by 7");
			}
			if (i % 13 == 0) {
				System.out.println(i + " is divisible by 13");
			}
		}
		i++;
	}

}
