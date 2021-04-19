package sangeeta;

public class calculatorWithReturnTypeValue {
	
	int Addition(int x, int y){
		int AddAnswer = x+y;
		return AddAnswer;
	}
	int Subtraction(int x, int y){
		int SubAnswer = x-y;
		return SubAnswer;
	}
	int Multiplication(int x, int y){
		int MulAnswer = x*y;
		return MulAnswer;
	}
	int Division(int x, int y){
		int DivAnswer = x/y;
		return DivAnswer;
	}
	
	void printTotalAnswer(int AddAnswer, int SubAnswer, int MulAnswer, int DivAnswer) {
		int Total = AddAnswer + SubAnswer + MulAnswer + DivAnswer;
		System.out.println(" Total Answer is "+ Total);
	}
	public static void main(String[] a){
		CalculatorWithReturnType calculatorWithReturnType = new CalculatorWithReturnType();
		int AddAnswer = calculatorWithReturnType.Addition(10,20);
		int SubAnswer = calculatorWithReturnType.Subtraction(50,25);
		int MulAnswer = calculatorWithReturnType.Multiplication(3,4);
		int DivAnswer = calculatorWithReturnType.Division(15,5);
		calculatorWithReturnType.printTotalAnswer(AddAnswer, SubAnswer, MulAnswer, DivAnswer);
	}

}
