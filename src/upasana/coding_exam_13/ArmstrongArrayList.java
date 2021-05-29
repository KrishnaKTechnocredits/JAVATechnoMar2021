/*
1. return all the armstrong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int number[]){
//write your logic
}
 */

package upasana.coding_exam_13;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstrongArrayList {

	public ArrayList<Integer> getArmstrongNumber(Integer[] input) {

		ArrayList<Integer> outputList = new ArrayList<Integer>();

		ArrayList<Integer> inputList = new ArrayList<Integer>(Arrays.asList(input));
		for (int index = 0; index < inputList.size(); index++) {
			int rem = 0;
			int ans = 0;
			int num = inputList.get(index);
			int revNum = inputList.get(index);
			while (revNum > 0) {
				rem = revNum % 10;
				revNum = revNum / 10;
				ans = ans + (rem * rem * rem);

			}
			if (num == ans)
				outputList.add(num);
		}
		return outputList;

	} 

	public static void main(String[] args) {

		Integer[] input = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> outputList = new ArmstrongArrayList().getArmstrongNumber(input);
		System.out.println(outputList);
	}
}
