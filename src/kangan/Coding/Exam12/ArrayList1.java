package kangan.Coding.Exam12;

import java.util.ArrayList;
/*1) ArrayList<Integer> filterNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

public class ArrayList1 {

	ArrayList<Integer> filterNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0
					|| (arr.get(index) % 3 == 0 && arr.get(index) % 3 == 0)) {
				output.add(arr.get(index));
			}

		}
		return output;

	}

	public static void main(String[] args) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(2);
		numbers.add(3);
		numbers.add(6);
		numbers.add(15);
		numbers.add(44);
		numbers.add(32);

		System.out.println(numbers.size());

		ArrayList1 arrayList1 = new ArrayList1();

		ArrayList<Integer> output = arrayList1.filterNumber(numbers);
		System.out.println(output);
	}
}
