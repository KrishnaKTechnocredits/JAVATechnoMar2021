/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

package simmi.exam12;

import java.util.ArrayList;

public class DivisibleCollection {

	ArrayList<Integer> division(ArrayList<Integer> number) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < number.size(); index++) {
			if (number.get(index) % 3 == 0 || number.get(index) % 5 == 0)
				output.add(number.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(2);
		number.add(3);
		number.add(6);
		number.add(15);
		number.add(44);
		number.add(32);

		DivisibleCollection divisibleCollection = new DivisibleCollection();
		ArrayList<Integer> output = divisibleCollection.division(number);
		System.out.println(output);
	}
}
