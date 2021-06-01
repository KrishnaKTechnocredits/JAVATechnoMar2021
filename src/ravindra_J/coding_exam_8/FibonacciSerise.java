/*
 2: Print Fibinacci series up to 8 numbers. [10 mins]
output : 0 1 1 2 3 5 8 13
 */
package ravindra_J.coding_exam_8;

public class FibonacciSerise {
	void findfibonacci() {
		int num1=0, num2 = 1, num3;
		int count=8;
		System.out.print(num1+" "+num2);
		for(int i=2;i<count;++i) {
			num3=num1+num2;
			System.out.print(" "+num3);
			num1=num2;
			num2=num3;
		}
	}
	public static void main(String[] args) {
		FibonacciSerise fibonacciserise = new FibonacciSerise();

		fibonacciserise.findfibonacci();
	}
}
