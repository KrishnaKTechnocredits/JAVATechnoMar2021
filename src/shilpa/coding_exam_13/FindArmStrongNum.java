/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]
*/
package shilpa.coding_exam_13;

import java.util.ArrayList;

public class FindArmStrongNum {
	public ArrayList<Integer> getArmStrongNumbers(int[] number) {
		ArrayList<Integer> outputList = new ArrayList<Integer>();
		int temp1 = 0;
		int num1 = 0;
		int temp2;
		for (int num : number) {
			temp2 = num;
			while (num > 0) {
				temp1 = num % 10;
				num = num / 10;
				num1 += (temp1 * temp1 * temp1);
			}
			if (num1 == temp2) {
				outputList.add(temp2);
			}
			temp1 = 0;
			num1 = 0;
		}
		return outputList;

	}

	public static void main(String[] args) {
		FindArmStrongNum findArmStrongNum = new FindArmStrongNum();
		int[] input = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> output = findArmStrongNum.getArmStrongNumbers(input);
		System.out.println("Arm-strong numbers from given array are");
		System.out.println(output);

	}

}
