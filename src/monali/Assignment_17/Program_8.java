package monali.Assignment_17;

import java.util.Scanner;

public class Program_8 {

	String nameOfMaxLength(String[] str) {
		String maxName = str[0];
		for (int index = 1; index < str.length; index++) {
			if (maxName.length() < str[index].length())
				maxName = str[index];
		}
		System.out.println("length of maximum name is " + maxName);
		return maxName;
	}

	public static void main(String[] a) {
		Program_8 program = new Program_8();
		String str[] = { "monali", "tondare", "pune" };
		for (int index = 0; index < str.length; index++) {
		}
		program.nameOfMaxLength(str);

	}
}
