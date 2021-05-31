/*Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
*/
package prashant.coding_exam_14;

import java.util.ArrayList;

public class UniqueNumArray {
	public ArrayList<Integer> getUniqueNumbers(int number[]) {
		ArrayList<Integer> outList = new ArrayList<Integer>();
		for (int index = 0; index < number.length; index++) {
			if (!outList.contains(number[index])) {
				outList.add(number[index]);
			}
		}
		return outList;
	}

	public static void main(String[] args) {
		int[] arrnum = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = new UniqueNumArray().getUniqueNumbers(arrnum);
		System.out.println("Unique numbers from given array " + result);
	}
}
