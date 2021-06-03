/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]
*/
package simmi.exam13;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstrongNumber {
	int num = 0;
	int temp = 0;

	ArrayList<Integer> getArmStrongNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> input = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			int sum = 0;
			temp = arr.get(index);
			while (temp != 0) {
				num = temp % 10;
				temp = temp / 10;
				sum = sum + (num * num * num);
			}
			if (sum == arr.get(index)) {
				input.add(arr.get(index));
			}
		}
		return input;
	}

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(153);
		num.add(279);
		num.add(371);
		num.add(303);
		num.add(407);
		ArrayList<Integer> output = new ArmstrongNumber().getArmStrongNumber(num);
		System.out.println(output);
	}
}
