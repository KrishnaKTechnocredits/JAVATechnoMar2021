/*
 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}
 */

package priyanka_Panat.coding_exam_13;

import java.util.ArrayList;

public class ArmstrongNumber {

	public ArrayList<Integer> getArmStrongNumber(int[] numbers) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int result = 0;
			int num = numbers[index];
			while (num != 0) {
				int rem = num % 10;
				num = num / 10;
				result = result + (rem * rem * rem);
			}
			if (result == numbers[index])
				numberList.add(numbers[index]);

		}
		return numberList;
	}

	public static void main(String[] args) {
		ArmstrongNumber armstrongNumber = new ArmstrongNumber();
		int[] arr = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> output = armstrongNumber.getArmStrongNumber(arr);
		System.out.println("Armstrong Numbers from given array is : " + output);
	}

}
