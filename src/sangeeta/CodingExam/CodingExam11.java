/*Verify given number is Palindrome or not.
input : 12323
output : number is not palindrome

input : 15251
output : number is palindrome*/

package sangeeta.CodingExam;

import java.util.Scanner;

public class CodingExam11 {

	void palindromNum(int inputnum) {
		int num = inputnum;
		int ans = 0;
		while (num > 0) {
			int Reminder = num % 10;
			num = num / 10;
			ans = ans * 10 + Reminder;
		}
		System.out.println("Input number is " + inputnum);
		System.out.println("Reversed number is " + ans);
		if (ans == inputnum)
			System.out.println("Number is Palindrom");
		else
			System.out.println("Number is not Palindrom");
	}

	public static void main(String[] args) {
		CodingExam11 codingExam11 = new CodingExam11();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number to know if it is palindrom or not ");
		int inputnum = scanner.nextInt();
		codingExam11.palindromNum(inputnum);
	}

}
