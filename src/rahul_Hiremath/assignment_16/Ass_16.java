package rahul_Hiremath.assignment_16;

import java.util.Scanner;

public class Ass_16 {

	void checkMaxCharCount(String input, char ch) {
		int count = 0;
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch)
				count++;
		}
		System.out.println(ch + " -> " + count);
	}

	public static void main(String[] args) {

		Ass_16 ass_16 = new Ass_16();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the string");
		String input = scanner.next();
		System.out.println("Please enter the char");
		char ch = scanner.next().charAt(0);
		ass_16.checkMaxCharCount(input, ch);
		scanner.close();
	}

}
