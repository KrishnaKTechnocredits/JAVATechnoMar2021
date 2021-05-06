package surabhi.assignment30;

import java.util.Scanner;

	public class SwapNumbersUsingVar {
	
	void displaySwapNumbers(int n1, int n2) {
		int temp=0;
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("Numbers After swapping :" +n1+" and "+n2);
		
	}
	
	public static void main(String[] args) {
		SwapNumbersUsingVar swapNumbersUsingVar=new SwapNumbersUsingVar();
		System.out.println("Enter the two numbers ");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		swapNumbersUsingVar.displaySwapNumbers(num1, num2);

	}

}
