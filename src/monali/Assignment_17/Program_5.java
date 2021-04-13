package monali.Assignment_17;

import java.util.Scanner;

public class Program_5 {

	int targetnumber, count;

	boolean isNumberPresent(int[] numbers, int targetNumber) {
		for (int index = 0; index < numbers.length; index++) {
			if (numbers[index] == targetnumber) {
				System.out.println("number is present");
				return true;
			}
		}
		System.out.println("number is not present");
		return false;
	}
	

	public static void main(String[] a) {
		Program_5 program = new Program_5();
		int num[] = { 3, 4, 6, 1, 8, 0 };
		program.isNumberPresent(num, 0);

	}

}
