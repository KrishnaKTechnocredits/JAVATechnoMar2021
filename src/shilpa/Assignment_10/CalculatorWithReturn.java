/*3rd April'2021

Java Assignment-10 : 3rd April 2021
Write a class called calculator with following functionality.
a. add
b. subtraction
c. division
d. multiplication
e. printTotalAnswer.

Method a,b,c,d should have 2 parameters and return int value.
printTotalAnswer method should have 4 parameters and doesnt return anything.
Note : do not create any instance variable.*/

package shilpa.Assignment_10;

public class CalculatorWithReturn {
	
	int addition(int num1, int num2){
		return num1+num2;
		}
		
	int substract(int num1, int num2){
		return num1-num2;
		}
		
	int multiplication(int num1, int num2){
		return num1*num2;
		}
		
	int division(int num1, int num2){
		return num1/num2;
		}
	
	void printTotalAnswer(int addition, int substriction, int multiplication, int division){
		
		System.out.println("Addition:- "+addition+", Substraction:- "+substriction+", Multiplication:-"+multiplication+", Division:-"+division);
		}
	
	public static void main(String[] arg){
		CalculatorWithReturn cal = new CalculatorWithReturn();
		int addAnswer = cal.addition(10, 20);
		int SubAnswer = cal.substract(20,5);
		int multiAnswer = cal.multiplication(5, 5);
		int divideAnswer = cal.division(20, 5);
		cal.printTotalAnswer(addAnswer, SubAnswer, multiAnswer, divideAnswer);
		}
}
