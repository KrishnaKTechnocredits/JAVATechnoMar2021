package mayur.coding_exam_13;

import java.util.ArrayList;

public class ArmStrongNumber {
	ArrayList<Integer> getArmStrongNumber(int[] arr) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			int cube = 0;
			int num = arr[index];
			int arm;
			int temp = num;

			while (num > 0) {
				arm = num % 10;
				num = num / 10;
				cube = cube + (arm * arm * arm);
				if (temp == cube)
					number.add(temp);
			}
		}

		return number;
	}

	public static void main(String[] args) {
		ArmStrongNumber arm = new ArmStrongNumber();
		int arr[] = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> num = arm.getArmStrongNumber(arr);
		System.out.println("ArmStrong Number from given array are " + num);

	}
}
