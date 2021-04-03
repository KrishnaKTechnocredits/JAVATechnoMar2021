package madhavi_Khasbage.MethodReturnType;

/*Write a class called calculator with following functionality.
	a. add
	b. subtraction
	c. division
	d. multiplication
	e. printTotalAnswer.	
	Method a,b,c,d should have 2 parameters and return int value.
	printTotalAnswer method should have 4 parameters and doesnt return anything.
	Note : do not create any instance variable.*/

public class Calculator {	
	
	int firstNumber,secondNumber;
	
	int addition(int num1, int num2){
		int total=0;
		firstNumber=num1;
		secondNumber=num2;
		if(num1>0 && num2>0) {
			total=num1+num2;
		}else {
			System.out.println("Addition : Please enter value greater than 0.");
		}			
		return total;		
	}	
	
	int subtraction(int num1, int num2){
		int total=0;
		if(num1>0 && num2>0) {
			total=num1-num2;
		}else {
			System.out.println("Subtraction : Please enter value greater than 0.");
		}		
		return total;		
	}
	
	int division(int num1, int num2){
		int total=0;
		if(num1>0 && num2>0) {
			total=num1/num2;
		}else {
			System.out.println("Division : Please enter value greater than 0.");
		}
		return total;		
	}
	
	int multiplication(int num1, int num2){
		int total=0;
		if(num1>0 && num2>0) {
			total=num1*num2;
		}else {
			System.out.println("Multiplication : Please enter value greater than 0.");
		}
		return total;		
	}
	
	void printTotalAnswer() {	
		System.out.println("Addition       :" + addition(10,20) + "\nSubtraction    :" +subtraction(20,10) +
						"\nDivision       :" + division(18,5) + "\nMultiplication :" + multiplication(20,4) );
	}
	
	public static void main(String[] args){
		Calculator calculator1=new Calculator();
		calculator1.printTotalAnswer();		
	}
}
