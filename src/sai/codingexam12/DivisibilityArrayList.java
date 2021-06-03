package sai.codingexam12;

import java.util.ArrayList;

public class DivisibilityArrayList {

	ArrayList<Integer> input(ArrayList<Integer> inputNumber) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < inputNumber.size(); index++) {
			if ((inputNumber.get(index) % 3 == 0) || (inputNumber.get(index) % 5 == 0)) {
				output.add(inputNumber.get(index));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(15);
		input.add(44);
		input.add(32);
		DivisibilityArrayList divisibilityArrayList = new DivisibilityArrayList();
		ArrayList<Integer> output = divisibilityArrayList.input(input);
		System.out.println(output);
	}
}
