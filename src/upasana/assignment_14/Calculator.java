package upasana.assignment_14;

import java.util.Scanner;

public class Calculator {
	
	int add(int x,int y) {
		return (x+y);
	}
	
	int sub(int x,int y) {
		return (x-y);
	}
	
	int div(int x,int y) {
		return (x/y);
	}
	
	int mul(int x,int y) {
		return (x*y);
	}
	
	int printTotalAnswer(int w,int x, int y,int z) {
		System.out.println("Sum is "+w + " \nSubtraction is "+x+ "\nDivision is  "+y+ " \nMultiplication is " + z);;
		return 0;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter 1st no : ");
		int x = scanner.nextInt();
		System.out.println("Enter 2nd no : ");
		int y = scanner.nextInt();
		int sum=calculator.add(x, y);
		//System.out.println("sum is "+sum);
		
		System.out.println("Enter 1st no : ");
		int x1 = scanner.nextInt();
		System.out.println("Enter 2nd no : ");
		int y1 = scanner.nextInt();
		int sub=calculator.sub(x1,y1);
		//System.out.println("subtraction is "+sub);
		
		System.out.println("Enter 1st no : ");
		int x2 = scanner.nextInt();
		System.out.println("Enter 2nd no : ");
		int y2 = scanner.nextInt();
		int div=calculator.div(x2,y2);
		//System.out.println("division is "+div);
		
		System.out.println("Enter 1st no : ");
		int x3 = scanner.nextInt();
		System.out.println("Enter 2nd no : ");
		int y3 = scanner.nextInt();
		int mul=calculator.mul(x3,y3);
		//System.out.println("multiplication is "+mul);
		
		calculator.printTotalAnswer(sum,sub,div,mul);
	}
}
