/*
 1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15

*/

package ami.Coding_Exam_12;

import java.util.ArrayList;

public class CollectionArrayDiv {

	ArrayList<Integer> filerName(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if ((arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0)
					|| (arr.get(index) % 3 == 0 && arr.get(index) % 5 == 0)) {
				output.add(arr.get(index));
			}
		}
		return output;
	}

	public static void main(String[] a) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(10);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(15);
		input.add(44);
		input.add(32);

		CollectionArrayDiv a1 = new CollectionArrayDiv();
		ArrayList<Integer> fInput = a1.filerName(input);
		System.out.println(fInput);
	}
}
