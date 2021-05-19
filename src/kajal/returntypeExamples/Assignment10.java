package kajal.returntypeExamples;

public class Assignment10 {

	int add(int num1, int num2) {
		return num1 + num2;
	}

	int sub(int num1, int num2) {
		return num1 - num2;
	}

	int multi(int num1, int num2) {
		return num1 * num2;
	}

	int div(int num1, int num2) {
		return num1 / num2;
	}

	void printtotalAns(int addans, int subans, int mulans, int divans) {
		System.out.println(addans + subans + mulans + divans);
	}

	public static void main(String[] args) {
		Assignment10 calculate = new Assignment10();
		int resultadd = calculate.add(10, 10);
		int resultsub = calculate.sub(10, 10);
		int resultmul = calculate.multi(10, 10);
		int resultdiv = calculate.div(10, 10);

		calculate.printtotalAns(resultadd, resultsub, resultmul, resultdiv);
	}

}
