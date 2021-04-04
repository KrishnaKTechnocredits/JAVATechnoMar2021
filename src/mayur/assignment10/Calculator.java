package mayur.assignment10;

public class Calculator {
	int add(int x,int y) {
		return x+y;
	}

	int subtraction(int x,int y) {
		return x-y;
	}

	int division(int x,int y) {
		return x/y;
	}

	int multiplication(int x,int y) {
		return x*y;
	}

	void printTotalAnswer(int addAnswer,int subtractionAnswer,int divisionAnswer,int multiplicationAnswer) {
		int totalAnswer=addAnswer+subtractionAnswer+divisionAnswer+multiplicationAnswer;
		System.out.println("Total answer is : "+totalAnswer);
	}

	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int x=calculator.add(10,10);
		int y=calculator.subtraction(20, 14);
		int z=calculator.division(100, 20);
		int a=calculator.multiplication(12, 12);
		calculator.printTotalAnswer(x, y, z, a);



	}
}
