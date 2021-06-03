package mayur.coding_exam_14;

import java.util.ArrayList;

public class PalindromeNumber {
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
		PalindromeNumber pal = new PalindromeNumber();
		int[] num = { 123, 121, 989, 1221, 951 };
		ArrayList<Integer> arr = pal.getPalindrome(num);
		System.out.println("Palindrome Numbers in the given array are:" + arr);
	}
}
