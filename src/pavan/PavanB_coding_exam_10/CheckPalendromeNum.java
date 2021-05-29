package pavan.PavanB_Coding_exam_10;

import java.util.Scanner;

public class CheckPalendromeNum {

	void getDetails(int number) {
		int num = number;
		int r, sum = 0;
		int temp = num;
		while (num > 0) {
			r = num % 10;
			sum = (sum * 10) + r;
			num = num / 10;
		}if (sum == temp)
			System.out.println("is palendrome");
		else
			System.out.println("not palendrome");
	}
	public static void main(String[] args) {
		CheckPalendromeNum c = new CheckPalendromeNum();
		Scanner scan = new Scanner(System.in);
		System.out.println("proide the numbers to be checked");
		int number = scan.nextInt();
		c.getDetails(number);
	}
}
