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

package rashmi.returntype_Assignment_10;

public class CalculatorReturn {
	
	int add(int num1,int num2){
		return num1+num2;
	}
		
	int sub(int num1,int num2){
		return num1-num2;
	}
		
	int mul(int num1,int num2){
		return num1*num2;
	}
		
	int div(int num1,int num2){
		if(num2>=0){
			return num1/num2;
		}
		else{
			System.out.println("number cannot be divided by 0...");
			return 0;
		}
	}
		
	void printTotalAnswer(int addAns,int subAns,int mulAns, int divAns){	
		int total = addAns+subAns+mulAns+divAns;
		System.out.println("Total answer : "+total);
	}
		
	public static void main(String[] args){
		CalculatorReturn calculatorReturn = new CalculatorReturn();
		int addAns = calculatorReturn.add(2,5);
		int subAns = calculatorReturn.sub(8,9);
		int divAns = calculatorReturn.div(2,6);
		int mulAns = calculatorReturn.mul(10,2);
		calculatorReturn.printTotalAnswer(addAns,subAns,mulAns,divAns);
			
		addAns = calculatorReturn.add(-10,5);
		subAns = calculatorReturn.sub(2,5);
		divAns = calculatorReturn.div(8,9);
		mulAns = calculatorReturn.mul(-4,-3);
		calculatorReturn.printTotalAnswer(addAns,subAns,mulAns,divAns);
	}
}
			
		
		


