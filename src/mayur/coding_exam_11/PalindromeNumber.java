package mayur.coding_exam_11;

import java.util.Scanner;

public class PalindromeNumber {
	void getPalindromeNumber(int num) {
		int sum = 0;
		int temp = num;
		while (temp != 0) {
			int mod = temp % 10;
			temp = temp / 10;
			sum = sum * 10 + mod;
		}
		if (sum == num) {
			System.out.println(num+  " is Palindrome Number");
		} else {
			System.out.println(num+ " is not Palindrome Number");
		}
	}

	public static void main(String[] args) {
		PalindromeNumber palindrome = new PalindromeNumber();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		System.out.println("Enter the number ");
		int num1 = sc.nextInt();
		palindrome.getPalindromeNumber(num);
		palindrome.getPalindromeNumber(num1);
		sc.close();

	}
}
