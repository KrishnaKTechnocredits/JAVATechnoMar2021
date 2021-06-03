package sai.codingexam14;

import java.util.ArrayList;

public class Palindrome {

	public ArrayList<Integer> getPalindrome(int[] numbers) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int temp = numbers[index];
			int sum = 0;
			while (temp != 0) {
				int mod = temp % 10;
				temp = temp / 10;
				sum = sum * 10 + mod;
				if (sum == numbers[index])
					output.add(numbers[index]);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		int[] num = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> arr = palindrome.getPalindrome(num);
		System.out.println("Palindrome Numbers are:" + arr);

	}

}
