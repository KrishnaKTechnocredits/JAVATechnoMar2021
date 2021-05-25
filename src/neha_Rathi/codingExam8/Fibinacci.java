package neha_Rathi.codingExam8;

public class Fibinacci {
	
	static void calcFibinacci(int num1) {
		int firstNum=0;
		int secondNum=1;
		int count=0;
		int num=0;
		while(count<num1) {
			System.out.println(firstNum);
			num=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=num;
			count++;
		}
	}

	public static void main(String[] args) {
		calcFibinacci(8);
	}
}
