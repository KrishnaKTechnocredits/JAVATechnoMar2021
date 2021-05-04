package pavan.Assignment31;

import java.util.Scanner;

public class SwapWithTh {
	int a = 0;
	int b = 0;
	int c = 0;

	void swap(int num1, int num2) {
		a = num1;
		b = num2;

		c = num1;
		a = num2;
		b = num1;
		System.out.println("After swapping Details are " + "A:" + a + " " + "B:" + b);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first numbers which is to be swap for A:");
		int num1 = scan.nextInt();
		System.out.println("Enter the first numbers which is to be swap for B:");
		int num2 = scan.nextInt();
		SwapWithTh s = new SwapWithTh();
		s.swap(num1, num2);

	}
}
