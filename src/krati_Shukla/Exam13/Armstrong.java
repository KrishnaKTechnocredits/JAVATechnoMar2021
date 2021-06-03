/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]*/

package krati_Shukla.Exam13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Armstrong {

	public ArrayList<Integer> getArmStrongNumber(int[] number) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		// List<Integer> list = Arrays.asList(number);

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

	public static void main(String[] a) {
		Armstrong armstrong = new Armstrong();
		int[] arr = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> answer = armstrong.getArmStrongNumber(arr);
		System.out.println(answer);
	}

}
