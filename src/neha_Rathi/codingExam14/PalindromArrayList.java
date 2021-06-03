package neha_Rathi.codingExam14;

import java.util.ArrayList;

public class PalindromArrayList {

	static boolean palindromNum(int num) {
		int rem = 0;
		int reverseNum = 0;
		int num1 = num;
		boolean isPalindrom = false;
		while (num1 > 0) {
			rem = num1 % 10;
			reverseNum = reverseNum * 10 + rem;
			num1 = num1 / 10;
		}
		if (reverseNum == num) 
			isPalindrom = true;
		return isPalindrom;
	}

	public static ArrayList<Integer> getPalindrom(int[] numbers) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : numbers) {
			if (palindromNum(num))
				list.add(num);
		}
		return list;
	}

	public static void main(String[] args) {
		int[] arr = { 123, 121, 989, 1221, 951 };
		System.out.println(getPalindrom(arr));
	}
}
