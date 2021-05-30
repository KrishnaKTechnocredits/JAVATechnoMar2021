/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.*/

package krati_Shukla.Exam12;

import java.util.ArrayList;

public class Divisibility {
	ArrayList<Integer> isDivisible(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		int size = arr.size();
		for (int index = 0; index < size; index++) {
			if ((arr.get(index) % 3 == 0) || (arr.get(index) % 5 == 0))
				output.add(arr.get(index));
		}
		return output;
	}

	public static void main(String[] a) {
		Divisibility div = new Divisibility();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(15);
		input.add(44);
		input.add(32);

		ArrayList<Integer> answer = div.isDivisible(input);
		System.out.println("Numbers divisible by 3 or 5 are " + answer);
	}

}
