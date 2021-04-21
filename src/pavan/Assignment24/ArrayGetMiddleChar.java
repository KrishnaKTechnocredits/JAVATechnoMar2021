/*
 return the middle char from array
 */

package pavan.Assignment24;

import java.util.Scanner;

public class ArrayGetMiddleChar {
	void getMiddlechar(String[] input) {

		for (int index = 0; index < input.length; index++) {
			String str = input[index];
			int pos;
			if (str.length() % 2 == 0) {
				pos = str.length() / 2 - 1;
			} else
				pos = (str.length() / 2);
			char ch = str.charAt(pos);
			System.out.println(ch);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Length of array");
		int len = scan.nextInt();
		String[] arr = new String[len];
		System.out.println("Enter the elements of array");
		for (int index = 0; index < len; index++) {
			arr[index] = scan.next();
		}ArrayGetMiddleChar assignment24 = new ArrayGetMiddleChar();
			assignment24.getMiddlechar(arr);
	}

}
