package krishna.Assignment_10;

public class CalculatorReturnEmp {
	int add(int x, int y) {
		int z= x+y;
		return z;
		
	}
	
	int subtraction(int x, int y) {
		if(x>=y) {
			int z= x-y;
			return z;
		}else {
			return 0;// Checking negative case only for this condition
		}
	}
	
	int division(int x, int y) {
		int z= x/y;
		return z;
	}
	
	int multiplication(int x, int y) {
		int z= x*y;
		return z;
	}
	
	void printTotalAnswer(int add,int subtraction,int division,int multiplication) {
		System.out.println("Answer after callout printTotalAnswer method");
		System.out.println();
		System.out.println("The addition is :"+add);
		System.out.println("The substraction is :"+subtraction);
		System.out.println("The division is :"+division);
		System.out.println("The multiplication is :"+multiplication);
	}
	
	public static void main(String[] args) {
		CalculatorReturnEmp calculatorReturnEmp = new CalculatorReturnEmp();
		int add=calculatorReturnEmp.add(10,20);
		int subtraction=calculatorReturnEmp.subtraction(1, 6);
		int division=calculatorReturnEmp.division(10, 5);
		int multiplication=calculatorReturnEmp.multiplication(7, 8);
		calculatorReturnEmp.printTotalAnswer(add,subtraction,division,multiplication);
	}

}
