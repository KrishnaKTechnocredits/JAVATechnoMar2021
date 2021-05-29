package kangan.Coding.Exam13;

import java.util.ArrayList;

/*1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]
*/
public class ReturnArmstrong {

	ArrayList<Integer> returnArm(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {

			int num = arr.get(index);
			int temp = num;
			int sum = 0;
			while (!(temp == 0)) {
				int mod = temp % 10;
				temp = temp / 10;
				sum += mod * mod * mod;
			}
			if (num == sum) {
				output.add(num);
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(153);
		numbers.add(279);
		numbers.add(371);
		numbers.add(303);
		numbers.add(407);
		ReturnArmstrong returnArmstrong = new ReturnArmstrong();
		ArrayList<Integer> output = returnArmstrong.returnArm(numbers);
		System.out.println(output);

	}
}
