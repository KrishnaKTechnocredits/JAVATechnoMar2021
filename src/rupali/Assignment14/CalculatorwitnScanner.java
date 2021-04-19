package rupali.Assignment14;

import java.util.Scanner;

public class CalculatorwitnScanner {
int ans;
	
	void add(int x,int y) {
			ans=x+y;
			System.out.println("Addition of number = " +ans);
	}
	
	void sub(int x,int y) {
			ans=x-y;
			System.out.println("Addition of number = " +ans);
	}
	
	public static void main(String[] args){
		CalculatorwitnScanner calculatorwitnScanner=new CalculatorwitnScanner();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter two integers for addition");
		int a=s.nextInt();
		int b=s.nextInt();
		calculatorwitnScanner.add(a, b);
		System.out.println("Enter two integers for Subtraction");
		a=s.nextInt();
		b=s.nextInt();
		calculatorwitnScanner.sub(a,b);
	}


}
