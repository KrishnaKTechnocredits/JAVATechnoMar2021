package shivani;

public class Numbers {
	int start;
	int endIndex;
	void evenNumber(int start, int endIndex) {
		System.out.println("even number are : " );
		for(int index =start;index<=endIndex;index++) 
			if (index%2==0) {
				System.out.println(index);
			}
		}
	

	void divisibleNumberFive(int start, int endIndex) {
		System.out.println("divisible by 5 ,numbers are  :");
		for (int index =start;index<=endIndex;index++) {
			if (index%5==0) {
				System.out.println(index);
			}
		}
	}

	void divisibleNumberFiveAndThree(int start, int endIndex) {
		System.out.println("Divisible by 5 & 3, numbers are :");
		for (int index = start; index <= endIndex; index++) {
			if (index%5==0 && index%3==0) {
				System.out.println(index );
			}
		}
	}

	void divisibleNumberSeven(int start, int endIndex) {
		for (int index = start; index <= endIndex; index++) {
			if (index%7==0) {
				System.out.println(index+" is Divisible by 7");

			} else if (index%13==0) {
				System.out.println(index+" is Divisible by 13");
			}
			
		}
	}

	public static void main(String[] args) {
		Numbers numbers1 = new Numbers();
		numbers1.evenNumber(10, 15);
		numbers1.divisibleNumberFive(10, 30);
		numbers1.divisibleNumberFiveAndThree(5, 18);
		numbers1.divisibleNumberSeven(5, 40);
	}

}
