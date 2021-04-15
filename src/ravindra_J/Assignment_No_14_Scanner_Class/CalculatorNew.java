package ravindra_J.Assignment_No_14_Scanner_Class;

import java.util.Scanner;

public class CalculatorNew {

	int add(int x,int y){
		return x+y;
	}

	int sub(int x,int y) {
		return x-y;
	}

	int multi(int x,int y){
		return  x*y;
	}

	float divi(int x,int y){
		return  x/y;
	}

	static void printTotalAnswer(int a,  int s, int m , double d){
		double total = a+s+m+d;
		System.out.println("total calculation of all the operation : - " +total);		
	}

	public static void main(String[] args) {
		double divi= 0.0;
		CalculatorNew calculatornew = new CalculatorNew();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter two number ");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int add = calculatornew.add(num1,num2);//5
		int sub = calculatornew.sub(num1,num2);//-1
		int multi = calculatornew.multi(num1,num2);//6
		if(num2 == 0.0) {
			System.out.println("please! try again,  num2 can not be zero here");
			num2 = scanner.nextInt();
		}else

			divi = calculatornew.divi(num1,num2);//0

		printTotalAnswer(add, sub, multi, divi);//10.0
	}

}


