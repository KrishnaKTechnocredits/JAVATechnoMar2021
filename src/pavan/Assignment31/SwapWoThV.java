package pavan.Assignment31;

import java.util.Scanner;

public class SwapWoThV {
	int a = 0;
	int b = 0;

	void SwWoTV(int num1, int num2) {
		int a = num1;
		int b = num2;

		a = a + b;
		b = a - b;

		a = a - b;
		System.out.println("After swaping vlues would be" + " A :" + a + " B : " + b);

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first numbers which is to be swap for A:");
		int num1 = scan.nextInt();
		System.out.println("Enter the first numbers which is to be swap for B:");
		int num2 = scan.nextInt();
		SwapWoThV s = new SwapWoThV();

		s.SwWoTV(num1, num2);

	}
}