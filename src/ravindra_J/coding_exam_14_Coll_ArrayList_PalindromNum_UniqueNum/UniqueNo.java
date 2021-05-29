/*
 2. Return all the unique numbers from given array.
input: [1,8,6,3,4,5,2,3,6,9,8,4]
output: [1,8,6,3,4,5,2,9]

public ArrayList<Integer> getUniqueNumbers(int words[]){
	//write your logic
}
 */
package ravindra_J.coding_exam_14_Coll_ArrayList_PalindromNum_UniqueNum;

import java.util.ArrayList;

public class UniqueNo {
	public ArrayList<Integer> getUniqueNumbers(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < number.length; i++) {
			int num1 = number[i];
			boolean flag = false;
			for (int index = 0; index < i; index++) {
				int num2 = number[index];
				if (num1 == num2) {
					flag = true;
					break;

				}
			}
			if (flag == false) {
				output.add(num1);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		UniqueNo uniqueno = new UniqueNo();
		int[] input = { 1, 8, 6, 3, 4, 5, 2, 3, 6, 9, 8, 4 };
		ArrayList<Integer> answer = uniqueno.getUniqueNumbers(input);
		System.out.println("Output : " + answer);
	}
}
