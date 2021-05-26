/* Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]
*/
package shilpa.coding_exam_14;

import java.util.LinkedHashSet;

public class FindUniqueNumFrmArr {
	public LinkedHashSet<Integer> getUniqueNumbers(int[] numbers) {
		LinkedHashSet<Integer> uniqueNum = new LinkedHashSet<Integer>();
		for (int num : numbers) {
			uniqueNum.add(num);
		}
		return uniqueNum;
	}

	public static void main(String[] args) {
		FindUniqueNumFrmArr findUniqueNumFrmArr = new FindUniqueNumFrmArr();
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		LinkedHashSet<Integer> output = findUniqueNumFrmArr.getUniqueNumbers(input);
		System.out.println("Unique numbers from given array");
		System.out.println(output);
	}
}
