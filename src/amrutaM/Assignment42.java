package amrutaM;

import java.util.ArrayList;

/*Program 1: Remove multiple occurrence of characters from given string.
input : "technocredits"
output : technordis */

public class Assignment42 {

	static void removeMultipleChar(String input) {
		String output = "";
		for (int index = 0; index < input.length(); index++) {
			char ch = input.charAt(index);
			if (input.indexOf(ch) == index) {
				output += ch;
			}
		}
		System.out.println(output);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		removeMultipleChar(input);
	}

}
