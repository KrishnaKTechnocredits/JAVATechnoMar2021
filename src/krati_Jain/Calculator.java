
package krati_Jain;

class Calculator {
	int x= 20;
	int y = 5;
	void add(){
		int answer = x + y;
		System.out.println("Addition of two variables is " +answer);
	}
	void subtract() {
		int answer = x - y;
		System.out.println("Substration of two variables is " +answer);
		}
		
	void multiply() {
		int answer = x*y;
		System.out.println("Multiplication of two variables is " +answer);
		}
		
	void division() {
		int answer = x/y;
		System.out.println("Division of two variables is " +answer);
		}
	public static void main(String[] a){
	Calculator calculator = new Calculator();
	calculator.add();
	calculator.subtract();
	calculator.multiply();
	calculator.division();
	}
}