package amrutaM;

import java.util.ArrayList;
import java.util.Arrays;

//Find length of a string without using length as a property or method

public class Assignment43_StringLength {

	static void getStringLength(String input) {
		int count = 0;
		char[] arr = input.toCharArray();
		for (char ch : arr) {
			count++;
		}
		
		System.out.println("Length of given string is --> " + count);
	}

	public static void main(String[] args) {
		String input = "technocredits";
		getStringLength(input);
	}
}
