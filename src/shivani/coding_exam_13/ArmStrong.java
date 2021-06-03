package shivani.coding_exam_13;

import java.util.ArrayList;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]*/

public class ArmStrong {

	public ArrayList<Integer> getArmStrongNumber(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int i = 0; i < number.length; i++) {
			int ans = 0;
			int cube = 0;
			int temp = 0;

			temp = number[i];
			while (temp != 0) {
				ans = temp % 10;
				temp = temp / 10;
				cube = cube + (ans * ans * ans);
			}
			if (cube == number[i]) {
				output.add(number[i]);
			}

		}

		return output;

	}

	public static void main(String[] args) {
		int[] input = { 153, 279, 371, 303, 407 };
		ArmStrong isArmStrong = new ArmStrong();
		ArrayList<Integer> output = new ArrayList<Integer>();
		output = isArmStrong.getArmStrongNumber(input);
		System.out.println("Output"+ output.toString());
	}
}