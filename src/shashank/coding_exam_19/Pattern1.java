package shashank.coding_exam_19;

import java.util.Scanner;

public class Pattern1 {

	private void getPattern(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern1 pattern1 = new Pattern1();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		pattern1.getPattern(str);
		scanner.close();
	}

}
