package komal.assignment_10;

/*Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.
Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
*/

public class NumberOperations {

	int addition(int x,int y) {
		return x+y;
	}

	int subtraction(int x,int y) {
		return x-y;
	}

	int multiplication(int x,int y) {
		return x*y;
	}

	int division(int x,int y) {
		return x/y;
	}

	void printTotalAnswer(int additionResult,int subtractionResult,int multiplicationResult,int divisionResult) {
		int totalAnswer = additionResult + subtractionResult + multiplicationResult + divisionResult;
		System.out.println("sum of all the operations is : "+totalAnswer);
	}

	public static void main(String[] args){
		NumberOperations numberOperations = new NumberOperations();
		int additionResult = numberOperations.addition(6,2);
		int subtractionResult = numberOperations.subtraction(8,2);
		int multiplicationResult = numberOperations.multiplication(6,6);
		int divisionResult = numberOperations.division(16,4);
		numberOperations.printTotalAnswer(additionResult,subtractionResult,multiplicationResult,divisionResult);
	}
}