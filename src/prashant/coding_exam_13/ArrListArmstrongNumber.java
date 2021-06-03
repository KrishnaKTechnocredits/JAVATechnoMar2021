/*return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]*/
package prashant.coding_exam_13;

import java.util.ArrayList;

public class ArrListArmstrongNumber {
	public ArrayList<Integer> getArmStrongNumber(int num[]) {
		ArrayList<Integer> tempArrList = new ArrayList<Integer>();
		int originalNum = 0;
		for (int index = 0; index < num.length; index++) {
			int temp = 0;
			int number = (int) num[index];
			while (number > 0) {
				originalNum = number % 10;
				number = number / 10;
				temp = temp + (originalNum * originalNum * originalNum);
			}
			if (num[index] == temp) {
				tempArrList.add(temp);
			}
		}
		return tempArrList;
	}

	public static void main(String[] args) {
		ArrListArmstrongNumber ArmStong = new ArrListArmstrongNumber();
		int[] numArr = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> output = ArmStong.getArmStrongNumber(numArr);
		System.out.println("Armstrong Numbers are from given Number list" + output);
	}
}