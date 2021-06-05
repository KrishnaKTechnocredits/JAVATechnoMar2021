package shashank.coding_exam_14;

import java.util.ArrayList;

public class PalindromeNumbersInArray {

	private ArrayList<Integer> getPalindromeNumbers(int input[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < input.length; index++) {
			int num = input[index], sum = 0;
			while (num > 0) {
				int a = num % 10;
				num = num / 10;
				sum = sum * 10 + a;
			}
			if (sum == input[index]) {
				list.add(input[index]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = { 123, 121, 989, 1221, 951 };
		PalindromeNumbersInArray palindromeNumbersInArray = new PalindromeNumbersInArray();
		ArrayList<Integer> output = palindromeNumbersInArray.getPalindromeNumbers(input);
		System.out.println("Palindrome numbers are :- " + output);
	}

}
