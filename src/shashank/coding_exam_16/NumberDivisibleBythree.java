package shashank.coding_exam_16;

import java.util.HashMap;

public class NumberDivisibleBythree {

	private HashMap<Integer, Integer> getNumberDivisibleBythree(int array[]) {
		HashMap<Integer, Integer> divisibleByThree = new HashMap<Integer, Integer>();
		for (int index = 0; index < array.length; index++) {
			if ((array[index] % 3 == 0)) {
				if (divisibleByThree.containsKey(array[index])) {
					divisibleByThree.put(array[index], divisibleByThree.get(array[index]) + 1);
				} else {
					divisibleByThree.put(array[index], 1);
				}
			}
		}
		return divisibleByThree;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberDivisibleBythree numberDivisibleBythree = new NumberDivisibleBythree();
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		HashMap<Integer, Integer> output = numberDivisibleBythree.getNumberDivisibleBythree(arr);
		System.out.println(output);

	}
}