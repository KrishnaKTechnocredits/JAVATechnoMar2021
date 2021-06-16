package kangan.Coding.Exam14;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]*/

public class ReturnUniqueNumUsingList {

	ArrayList<Integer> returnUnique(int[] numbers) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		//List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
		//Both will work
		Integer[] numb = {1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		List<Integer> numberList= Arrays.asList(numb);

		for (int num : numberList) {
			if ((numberList.indexOf(num) == numberList.lastIndexOf(num)) || !output.contains(num)) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ReturnUniqueNumUsingList returnUniqueNumUsingList = new ReturnUniqueNumUsingList();
		int[] arr = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> output = returnUniqueNumUsingList.returnUnique(arr);
		System.out.println(output);
	}
}
