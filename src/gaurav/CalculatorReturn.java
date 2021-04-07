package gaurav;

public class CalculatorReturn {
	 
	int add(int a,int b){
	    int answer = a+b;
		return answer;
		}
	int sub(int a,int b){
	    int answer = a-b;
	    return answer;
		}
	double div(int a,int b){
		double answer = a/b;
		return answer;
	}
	 
	int muti(int a,int b){
	    int answer = a*b;
		return answer;
		}
	void printTotalAnswer(int add,int sub, double div,int muti) {
		System.out.println("Additoin is:"+add);
		System.out.println("subtraction is:"+sub);
		System.out.println("division is:"+div);
		System.out.println("multiplication is:"+muti);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalculatorReturn calculatorReturn = new CalculatorReturn();
		int additoin=calculatorReturn.add(10,10);
		int subtraction=calculatorReturn.sub(15,12);
		double division=calculatorReturn.div(15,2);
		int multiplication=calculatorReturn.muti(10,5);
		calculatorReturn.printTotalAnswer(additoin,subtraction,division,multiplication);
	}

}
