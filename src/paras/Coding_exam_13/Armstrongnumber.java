/*
1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int number[]){
	//write your logic
}
 */
package paras.Coding_exam_13;

import java.util.ArrayList;

public class Armstrongnumber {

	ArrayList<Integer> getArmStrongNumber(int number[]) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < number.length; index++) {
			int num = number[index];
			int mod = 0;
			int Total = 0;
			int temp = num;
			while (temp > 0) {
				mod = temp % 10;
				temp = temp / 10;
				Total += mod * mod * mod;
			}
			if (Total == num) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		Armstrongnumber armstrongnumber = new Armstrongnumber();
		int[] input = { 153, 279, 371, 303, 407 };
		System.out.println(armstrongnumber.getArmStrongNumber(input));
	}

}
