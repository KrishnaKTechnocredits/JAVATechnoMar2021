package surabhi.assignment10;

public class Calculator {

	int add(int num1, int num2) {
		return num1+num2; 
	}
	
	int sub(int num1, int num2) {
		int sub;
		if(num1>num2) {
			sub=num1-num2;
		}else {
			sub=num2-num1;
		}
		return sub;
	}
	
	int mul(int num1, int num2) {
		return num1*num2;
	}
	
	double div(int num1, int num2) {
		return (double) num1/num2;
	}
	
	void displaySum(int a, int s, int m, double d) {
		System.out.println("Addition of all answers is " +(a+s+m+d));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator =new Calculator();

		int add=calculator.add(10, 20);
		int sub=calculator.sub(10, 20);
		int mul=calculator.mul(10, 20);
		double div=calculator.div(10, 20);
		
		calculator.displaySum(add, sub, mul, div);
	}

}
