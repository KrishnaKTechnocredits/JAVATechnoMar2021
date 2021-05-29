package ashtha.CodingExam12;

import java.util.ArrayList;

public class Number {

	ArrayList<Integer> findNumber(ArrayList<Integer> input) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < input.size(); index++) {
			int num = input.get(index);
			if ((num % 3 == 0 || num % 5 == 0) || (num % 3 == 0 && num % 5 == 0))
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		Number number = new Number();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(15);
		input.add(44);
		input.add(32);
		System.out.println("Input numbers : " + input);
		ArrayList<Integer> output = number.findNumber(input);
		System.out.println("Output numbers : " + output);
	}
}
