/* 
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

package kajal.returntypeExamples;

public class calculator {

	int add(int num1, int num2) {
		int answer = num1 + num2;
		return answer;
		
	}
	
	int sub(int num1, int num2) {
		int answer = num1 - num2;
		return answer;	
		
	}
	
	int multiplication(int num1, int num2) {
		int answer = num1 * num2;
		return answer;
		
	}
	
	int division(int num1, int num2) {
		int answer = num1 / num2;
		return answer;	
		
	}
	
	void printtotalAnswer(int addtotal, int subtotal, int multitotal, int divisiontotal){
		int total = addtotal + subtotal + multitotal + divisiontotal;
		System.out.println("total of addition, substraction, multiplication and division is = " + total);
	}
	
	public static void main(String[] args) {
	 calculator cal = new calculator();
	 int a = cal.add(10,10);
	 int b = cal.sub(20,10);
	 int c =  cal.multiplication(10,5);
	 int d =  cal.division(10,2);
	 
	 cal.printtotalAnswer(a,b,c,d);
	}
}
