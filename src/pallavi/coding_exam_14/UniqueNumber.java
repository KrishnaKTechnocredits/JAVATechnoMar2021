package pallavi.coding_exam_14;

import java.util.ArrayList;

/*2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]*/

public class UniqueNumber {

	public ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < words.length; index++) {
			boolean isflag=true;
			for (int innerIndex = index + 1; innerIndex < words.length; innerIndex++) {
				if (words[index] == words[innerIndex]) {
					isflag=false;
					break;
				}
			}
			if(isflag)
				output.add(words[index]);
		}
		return output;
	}

	public static void main(String[] args) {
		int input[] = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> output=new UniqueNumber().getUniqueNumbers(input);
		System.out.println(output);
	}

}
