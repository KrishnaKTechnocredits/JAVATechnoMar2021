package shashank.coding_exam_13;

import java.util.ArrayList;

public class ArmstrongNumberInArray {

	public ArrayList<Integer> getArmStrongNumber(int numbers[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int temp = numbers[index], num = 0;
			while (numbers[index] > 0) {

				int a = numbers[index] % 10;
				numbers[index] = numbers[index] / 10;
				num = num + (a * a * a);
			}
			if (num == temp)
				list.add(Integer.valueOf(temp));
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArmstrongNumberInArray armstrongNumberInArray = new ArmstrongNumberInArray();
		int array[] = { 153, 279, 371, 303, 407 };
		ArrayList<Integer> output = armstrongNumberInArray.getArmStrongNumber(array);
		System.out.println(output);
	}

}
