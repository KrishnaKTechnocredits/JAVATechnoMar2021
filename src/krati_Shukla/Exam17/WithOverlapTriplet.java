/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/

package krati_Shukla.Exam17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WithOverlapTriplet {

	ArrayList<Integer> GetTriplet(Integer[] input) {
		List<Integer> list = Arrays.asList(input);
		ArrayList<Integer> output = new ArrayList<Integer>();

		int sum = 0;
		int max = 0;

		for (int index = 0; index < list.size() - 2; index++) {

			sum = list.get(index) + +list.get(index + 1) + list.get(index + 2);
			if (max < sum) {
				max = sum;
				sum = 0;
				output.removeAll(output);
				output.add(list.get(index));
				output.add(list.get(index + 1));
				output.add(list.get(index + 2));
			}
		}
		System.out.println("Maximum sum is : " + max);
		return output;
	}

	public static void main(String[] args) {
		WithOverlapTriplet triplet = new WithOverlapTriplet();
		Integer[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		ArrayList<Integer> answer = triplet.GetTriplet(arr);
		System.out.println("Array list is " + answer);
	}

}
