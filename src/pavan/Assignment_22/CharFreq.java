
/*
 b) Find all character frequency from given name.
     Input: name - aakanksha
     Output : a -> 4
	          k -> 2
              n -> 1
              s -> 1
              h -> 1
 */
package pavan.Assignment_22;

import java.util.Scanner;

public class CharFreq {
	int getfeqdet(String input, char check) {
		int count = 0;

		for (int index = 0; index < input.length(); index++) {
			if (input.charAt(index) == check)
				count++;
		}
		return count;
	}

	void getFreqofch(String input) {
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);

			int res = getfeqdet(input, ch);
			System.out.println(ch + " " + res);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String");
		String input = scan.next();
		CharFreq charFreq = new CharFreq();
		charFreq.getFreqofch(input);

	}

}
