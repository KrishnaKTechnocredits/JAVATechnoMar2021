/*/*Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.
*/

package purva.ConnectionBetweenClasses.Assignment9;

public class Calculator{
	
	void printTotalAnswer(int addans, int subans, int mulans, int divans) {
		int totalAnswer = addans + subans + mulans+ divans;
		System.out.println("Total answer is "+totalAnswer);
		
	}
	
	public static void main(String[] args) {
		Addition addition = new Addition();
		int addans = addition.add(10,20);
		
		Substraction substraction = new Substraction();
		int subans = substraction.sub(20,10);
		
		Multiplication multiplication = new Multiplication();
		int mulans = multiplication.mul(20,10);
		
		Division division = new Division();
		int divans = division.div(20,10);
		
		Calculator calculator = new Calculator();
		calculator.printTotalAnswer(addans,subans,mulans,divans);
		
	}
}

