package pallavi.Assignment_8;


public class Numbers {

	public static void main(String[] args) {
		Numbers numbers = new Numbers();
		numbers.evenNumber(20, 30);
		numbers.divisibleBy5(10, 30);
		numbers.divisibleByFiveAndThree(5, 18);
		numbers.divisibleBy7And13(5,40);


	}

	public void evenNumber(int start, int end) {
		System.out.println("Even nubers are : ");
		while (start <= end) {
			if (start % 2 == 0)
				System.out.println(start);
		}
		start++;

	}

	void divisibleBy5(int start, int end) {
		System.out.println("Divisible by 5 nubers are : ");
		while (start <= end) {
			if (start % 5 == 0)
				System.out.println(start);
		}
		start++;

	}

	void divisibleByFiveAndThree(int start, int end) {
		System.out.println("Divisible by 5 & 3 nubers are : ");
	
		while (start <= end) {
			if (start % 5 == 0 && start % 3 == 0)
				System.out.println(start);
		}
		start++;
	}

	void divisibleBy7And13(int start, int end) {
		
		while (start <= end) {
			if (start % 7 == 0) {
				System.out.println(start + " is divisible by 7");
			}
			if (start % 13 == 0) {
				System.out.println(start + " is divisible by 13");
			}
		}
		start++;
	}

}
