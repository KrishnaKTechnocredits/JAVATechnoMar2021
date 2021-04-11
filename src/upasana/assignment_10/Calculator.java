package upasana.assignment_10;

public class Calculator {
	
	int add(int x,int y) {
		return (x+y);
	}
	
	int sub(int x,int y) {
		return (x-y);
	}
	
	int div(int x,int y) {
		return (x/y);
	}
	
	int mul(int x,int y) {
		return (x*y);
	}
	
	int printTotalAnswer(int w,int x, int y,int z) {
		System.out.println("Sum is "+w + " \nSubtraction is "+x+ "\nDivision is  "+y+ " \nMultiplication is " + z);;
		return 0;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int sum=calculator.add(10, 5);
		int sub=calculator.sub(10, 5);
		int div=calculator.div(10, 5);
		int mul=calculator.mul(10, 5);
		calculator.printTotalAnswer(sum,sub,div,mul);
	}
}
