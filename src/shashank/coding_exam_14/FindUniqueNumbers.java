package shashank.coding_exam_14;

import java.util.ArrayList;

public class FindUniqueNumbers {

	private ArrayList<Integer> getUniqueNumbers(int input[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < input.length; index++) {
			if (!(list.contains(input[index]))) {
				list.add(input[index]);
			}
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input[] = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		FindUniqueNumbers findUniqueNumbers = new FindUniqueNumbers();
		ArrayList outputList = findUniqueNumbers.getUniqueNumbers(input);
		System.out.println(outputList);
	}

}
