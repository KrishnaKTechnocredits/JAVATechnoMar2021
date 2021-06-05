/*
 2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */

package ami.Coding_Exam_14;

import java.util.ArrayList;
import java.util.HashSet;

public class ReturnUniqNum {

	public ArrayList<Integer> getUniqueNumbers(int words[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int num : words) {
			if (list.contains(num) == false) {
				list.add(num);
			}
		}
		System.out.println("Unique Number:");
		return list;
	}

	public static void main(String[] a) {
		ReturnUniqNum returnUniqNum = new ReturnUniqNum();
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		System.out.println(returnUniqNum.getUniqueNumbers(input));

	}
}
