/*Assignment - 16 : 9th April'2021
	Find the frequency of character from a given String array.
	Note: Take String and character from the user.
	Input : technocredits
	char : e
	output : e -> 2*/
package prashant.Assignment_13_16;

import java.util.Scanner;

public class CharFreqArr {
	int getFrequencyCount(String str, char target) {
		int Cnt = 0;
		for (int index = 0; index < str.length(); index++) {
			if (str.charAt(index) == target)
				Cnt++;
		}
		return Cnt;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String input = sc.nextLine();
		System.out.println("Enter Character for frequency :");
		String inputCh = sc.nextLine();
		char ch = inputCh.charAt(0);
		int Cnt = new CharFreqArr().getFrequencyCount(input.toLowerCase(), Character.toLowerCase(ch));
		System.out.println("Frequency of  " + ch + "->" + Cnt);
		sc.close();
	}
}
