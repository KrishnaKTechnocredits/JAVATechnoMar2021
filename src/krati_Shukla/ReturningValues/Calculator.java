package krati_Shukla.ReturningValues;

public class Calculator {
	
	int add (int num1 , int num2) {
		int aTotal = num1+num2;
		return aTotal;
	}
	
	int sub (int num1 , int num2) {
		int sTotal = num1-num2;
		return sTotal;
	}
	
	int mul (int num1 , int num2) {
		int mTotal = num1+num2;
		return mTotal;
	}
	
	double div (int num1 , int num2) {
		double dTotal = num1%num2;
		return dTotal;
	}
	
	void printTotalAnswer(int add1,int sub1, int mul1, double div1) {
		System.out.println("Addition is :"+add1);
		System.out.println("Subtraction is :"+sub1);
		System.out.println("Multiplication is :"+mul1);
		System.out.println("Division is :"+div1);
	}
	
	public static void main (String[] a) {
		Calculator calculator = new Calculator();
		int addTotal = calculator.add(2,5);
		int subTotal = calculator.sub(3, 1);
		int mulTotal = calculator.mul(1, 3);
		double divTotal = calculator.div(4,2);
		calculator.printTotalAnswer(addTotal, subTotal, mulTotal, divTotal);
		
	}

}
