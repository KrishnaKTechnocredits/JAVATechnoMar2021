/* Coding Exam - 13 : 25th May'2021 : Collection

1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int number[]){
//write your logic
}*/

package vaibhav.CodingExam13;

import java.util.ArrayList;

public class ArmStrongNumber {

	public ArrayList<Integer> getArmStrongNumber(int[] number) { // { 153, 279, 371, 303, 407 }

		ArrayList<Integer> outputArrList = new ArrayList<Integer>();

		for (int index = 0; index < number.length; index++) {

			int num = number[index]; // 153
			int ans = 0;
			while (num != 0) {
				int temp = num % 10; // 3 // 5
				num = num / 10; // 15 // 1
				ans = ans + (temp * temp * temp);
			}

			if (number[index] == ans)
				outputArrList.add(number[index]);
		}

		return outputArrList;
	}

	public static void main(String[] args) {

		int[] inputArr = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> outputArrList = new ArrayList<Integer>();

		ArmStrongNumber armStrongNumber = new ArmStrongNumber();

		outputArrList = armStrongNumber.getArmStrongNumber(inputArr);

		System.out.println("Arm strong number arrayList is : " + outputArrList);

	}

}
