package sai.codingexam14;

import java.util.LinkedHashSet;

public class UniqueNumberLinked {

	public LinkedHashSet<Integer> getUniqueNumbers(int[] numbers) {
		LinkedHashSet<Integer> uniqueNum = new LinkedHashSet<Integer>();
		for (int num : numbers) {
			uniqueNum.add(num);
		}
		return uniqueNum;
	}

	public static void main(String[] args) {
		UniqueNumberLinked uniqueNumberLinked = new UniqueNumberLinked();
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		LinkedHashSet<Integer> output = uniqueNumberLinked.getUniqueNumbers(input);
		System.out.println("Unique numbers are");
		System.out.println(output);
	}
}
