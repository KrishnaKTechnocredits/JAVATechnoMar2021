package surabhi.assignment30;

import java.util.Scanner;

public class SwapNumbers {
	
	void displaySwapNumbers(int n1, int n2) {
		n1=n1+n2;
		n2=n1-n2;
		n1=n1-n2;
		System.out.println("Numbers After swapping :" +n1+" and "+n2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwapNumbers swapNumbers=new SwapNumbers();
		System.out.println("Enter the two numbers ");
		Scanner scanner=new Scanner(System.in);
		int num1=scanner.nextInt();
		int num2=scanner.nextInt();
		swapNumbers.displaySwapNumbers(num1, num2);
		
	}

}
