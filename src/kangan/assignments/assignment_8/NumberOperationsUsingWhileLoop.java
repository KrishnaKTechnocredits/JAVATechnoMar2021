package kangan.assignments.assignment_8;

public class NumberOperationsUsingWhileLoop {

	void printEven(int start , int end) {
		int index = start;
		while(index<=end) {
			if(index % 2 == 0) {
				System.out.println(index + " is an even number");	
			}
			index++;
		}
	}
	void printDivByFive(int start , int end) {
		int index = start;
		while(index<=end) {
			if(index % 5 == 0) {
				System.out.println(index + " is divisible by five");
			}
			index++;
		}
	}
	void printDivByFiveAndThree(int start , int end) {
		int index = start;
		while(index<=end) {
			if(index % 5 == 0 && index % 3 ==0) {
				System.out.println(index + " is divisible by five and three");	
			}
			index++;
		}
	}
	void printDivBySevenOrThirteen(int start , int end) {
		int index = start;
		while(index<=end) {
			if(index % 7 == 0) {
				System.out.println(index + " is divisible by seven");
			}
				else if (index % 13 ==0) {
					System.out.println(index + " is divisible by thirteen");
			}
			index++;
		}
	}
	public static void main(String[] args) {
		NumberOperationsUsingWhileLoop numberOperations = new NumberOperationsUsingWhileLoop();
		numberOperations.printEven(10,15);
		numberOperations.printDivByFive(10,30);
		numberOperations.printDivByFiveAndThree(5,18);
		numberOperations.printDivBySevenOrThirteen(5,40);
		
	}
}

