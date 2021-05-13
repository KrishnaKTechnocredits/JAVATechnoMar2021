/*
 Find the frequency of character from a given String array
 technocredits
 */
package ami.Assignment_16;

import java.util.Scanner;

public class Freqofchar {
	int count = 0;

	void feqOfChar(String input, char ch) {
		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == ch) {
				count++;
			}
		}
		System.out.println("Frequence of Character :" + count);
	}

	public static void main(String[] a) {
		Freqofchar freqofchar = new Freqofchar();
		Scanner sc = new Scanner(System.in);
		System.out.println("Write input :");
		String input = sc.next();
		System.out.println("Write charactor input :");
		char ch = sc.next().charAt(0);
		freqofchar.feqOfChar(input, ch);

	}

}
