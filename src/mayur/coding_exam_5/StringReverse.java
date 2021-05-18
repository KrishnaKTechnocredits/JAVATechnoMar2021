package mayur.coding_exam_5;

import java.util.Scanner;

public class StringReverse {
	String getReverseString(String str) {
		String input = " ";
		str = str.trim();
		String rev[] = str.split(" ");
		for (int index = 0; index < rev.length; index++) {
			StringBuffer sb = new StringBuffer(rev[index]);
			sb.reverse();
			input += sb + " ";
		}
		return input;
	}

	public static void main(String[] args) {
		StringReverse sw = new StringReverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		System.out.println("Reverse of String is");
		String input = sw.getReverseString(str);
		System.out.println(input);
		sc.close();
	}

}
