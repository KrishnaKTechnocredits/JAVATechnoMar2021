package milind.assignment_10;
/*Assignment-10 write a class called Calculator with following functionality
 * a.add
 * b.subtrsction
 * c.multiplication
 * d.division
 * e.printTotalAnswer
 * method a,b,c,d should have 2 parameters and return int value printTotalans method should have 4 parameter and doesnt return anything
 * note:do not create any instance variable*/
public class Calculator {
	int add(int num1,int num2) {
		int sum= num1+num2;
		System.out.println(sum);
		return sum;
	}
	int subtraction(int num1,int num2) {
		int sub= num1-num2;
		System.out.println(sub);
		return sub;
	}
	int multiplication(int num1,int num2) {
		int mul= num1*num2;
		System.out.println(mul);
		return mul;
	}
	int division(int num1,int num2) {
		int div= num1-num2;
		System.out.println(div);
		return div;
	}
	void printTotalAns(int sum,int sub,int mul,double div) {
		double total=sum+sub+div+sum;
		System.out.println("Sum og all function return- "+total);
	}
	
	public static void main(String[] args) {
		Calculator calculator=new Calculator();
		int sum= calculator.add(4,5);
		int sub= calculator.subtraction(4,5);
		int mul= calculator.multiplication(7,5);
		double div= calculator.division(5,10);
		System.out.println("--Output--");
		calculator.printTotalAns(sum, sub, mul, div);
	}
	

}
