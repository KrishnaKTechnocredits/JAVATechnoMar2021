/*2. Return all the unique numbers from given array.
	input: [1,8,6,3,4,5,2,3,6,9,8,4]
	output: [1,8,6,3,4,5,2,9]
public ArrayList<Integer> getUniqueNumbers(int words[]){
*/

package kajal.Codingexam;

import java.util.ArrayList;

public class ArrayListUniqueNums {

	ArrayList<Integer> getUniqueNumber(int[] arrNum) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int index = 0; index < arrNum.length; index++) {
			if (!(arrList.contains(arrNum[index]))) {
				arrList.add(arrNum[index]);
			}
		}
		return arrList;
	}

	public static void main(String[] args) {
		int[] arrNum = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		System.out.println("Unique elements from Arraylists are:");
		System.out.println(new ArrayListUniqueNums().getUniqueNumber(arrNum));
	}
}
