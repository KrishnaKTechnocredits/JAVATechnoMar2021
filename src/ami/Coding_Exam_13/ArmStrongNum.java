/*
 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}
 */

package ami.Coding_Exam_13;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmStrongNum {

	public ArrayList<Integer> getArmStrongNumber(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int temp : number) {
			int num = temp;
			int cube = 0;
			while (num > 0) {
				int mod = num % 10;
				num = num / 10;
				cube = cube + (mod * mod * mod);
			}
			if (cube == temp)
				output.add(temp);
		}
		return output;
	}

	public static void main(String[] args) {
		ArmStrongNum armStrongNum = new ArmStrongNum();
		int[] input = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> fInput = armStrongNum.getArmStrongNumber(input);
		System.out.println(fInput);
	}
}
