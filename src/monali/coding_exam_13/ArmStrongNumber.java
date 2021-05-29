package monali.coding_exam_13;

import java.util.ArrayList;

public class ArmStrongNumber {

	public ArrayList<Integer> getArmStrongNumber(ArrayList<Integer> number) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < number.size(); index++) {
			int temp = number.get(index);
			int ans = 0;
			int cube = 0;
			while (temp > 0) {
				ans = temp % 10;
				temp = temp / 10;
				cube = cube + (ans * ans * ans);
			}
			if (number.get(index) == cube) {
				output.add(number.get(index));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		ArmStrongNumber num = new ArmStrongNumber();
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(153);
		number.add(279);
		number.add(371);
		number.add(303);
		number.add(407);
		ArrayList<Integer> output = num.getArmStrongNumber(number);
		System.out.println("ArmStrong number are " + output);
	}
}
