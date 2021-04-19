package kangan.assignments.assignment_6;

public class NumberOperations {

	void printEven(int start , int end) {
		for(int index=start; index<=end;index++) {
			if(index % 2 == 0) {
				System.out.println(index + " is an even number");
			}
		}
	}
	void printDivByFive(int start , int end) {
		for(int index=start; index<=end;index++) {
			if(index % 5 == 0) {
				System.out.println(index + " is divisible by five");
			}
		}
	}
	void printDivByFiveAndThree(int start , int end) {
		for(int index=start; index<=end;index++) {
			if(index % 5 == 0 && index % 3 ==0) {
				System.out.println(index + " is divisible by five and three");
			}
		}
	}
	void printDivBySevenOrThirteen(int start , int end) {
		for(int index=start; index<=end;index++) {
			if(index % 7 == 0) {
				System.out.println(index + " is divisible by seven");
			}
				else if (index % 13 ==0) {
					System.out.println(index + " is divisible by thirteen");
			}
		}
	}
	public static void main(String[] args) {
		NumberOperations numberOperations = new NumberOperations();
		numberOperations.printEven(10,15);
		numberOperations.printDivByFive(10,30);
		numberOperations.printDivByFiveAndThree(5,18);
		numberOperations.printDivBySevenOrThirteen(5,40);
		
	}
}
