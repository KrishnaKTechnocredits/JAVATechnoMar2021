package shashank_assignment_16;

import java.util.Scanner;

public class OneCharFrequency {

	private void oneCharFrequency(String str1, char ch) {
		int cnt = 0;
		for (int index = 0; index < str1.length(); index++) {
			if (str1.charAt(index) == ch) {
				cnt++;
			}
		}
		System.out.println("Occurance of " + ch + " in " + str1 + " is " + cnt + " times");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneCharFrequency oneCharFrequency = new OneCharFrequency();
		System.out.println("Enter String:- ");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		System.out.println("Enter Character you want to check occurance");
		String str1 = scanner.next();
		char ch = str1.charAt(0);
		oneCharFrequency.oneCharFrequency(str, ch);
		scanner.close();
	}
}
