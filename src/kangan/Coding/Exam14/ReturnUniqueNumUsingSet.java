package kangan.Coding.Exam14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]*/

public class ReturnUniqueNumUsingSet {

	LinkedHashSet<Integer> returnUnique(int[] numbers) {
		LinkedHashSet<Integer> output = new LinkedHashSet<Integer>();
		List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());

		for (int num : numberList) {
			output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnUniqueNumUsingSet returnUniqueNum = new ReturnUniqueNumUsingSet();
		int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		LinkedHashSet<Integer> output = returnUniqueNum.returnUnique(arr);
		System.out.println(output);
	}
}
