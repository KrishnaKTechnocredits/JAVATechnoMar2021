package technocredits.returnTypeExamples;

public class Example2 {

	int add(int x, int y) {
		return x+y;
	}

	int sub(int x, int y) {
		return x-y;
	}

	int mul(int x, int y) {
		return x*y;
	}

	void printTotal(int sumAnswer, int subAnswer) {
		int total = sumAnswer + subAnswer;
		System.out.println(total);
	}
	
	void display() {
		printTotal(10, 20);
		return;
	}
	
	public static void main(String[] args) {
		Example2 example2 = new Example2();
		int x = example2.add(10, 30); //40
		int subAnswer = example2.sub(50, 48); // 2
		example2.mul(3, 10); // 30
		example2.printTotal(x, subAnswer);
	}
}
