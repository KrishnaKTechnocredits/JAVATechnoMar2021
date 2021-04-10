package monika.Assignment10;
public class ExampleCalculator {
	int add(int add) {
		int total = 0;
		total = total +add;
		return total;
	}
	int sub(int total, int sub) {
		total = total - sub;
		return total;
	}
	int mul(int total,int mul) {
		total = total * mul;
		return total;
	}
	int div(int total, int div) {
		total = total/div;
		return total;
	}	
	void printTotalAnswer(int total) {
		System.out.println(total+" is the total calculation");
	}
	public static void main(String[] args) {
		ExampleCalculator calc = new ExampleCalculator();
		int addition = calc.add(-2);
		int subtraction = calc.sub(addition, 2);
		int multiplication = calc.mul(subtraction, 2);
		int division = calc.div(multiplication, 8);
		calc.printTotalAnswer(division);
	}
}
