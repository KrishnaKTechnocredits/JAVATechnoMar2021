package shashank.coding_exam_19;

import java.util.Scanner;

public class Pattern2 {
	private void getPattern(String str) {
		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch.length - i; j++) {
				System.out.print(ch[j]);
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern2 pattern2 = new Pattern2();
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		pattern2.getPattern(str);
		scanner.close();
	}

}
