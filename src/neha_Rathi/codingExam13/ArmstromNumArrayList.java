package neha_Rathi.codingExam13;

import java.util.ArrayList;
import java.util.Arrays;

public class ArmstromNumArrayList {

	static boolean ArmstromNum(int num1) {
		int rem = 0;
		int armstromNum = 0;
		boolean isArmstrom = false;
		int num2 = num1;
		while (num1 > 0) {
			rem = num1 % 10;
			armstromNum += rem * rem * rem;
			num1 = num1 / 10;
		}
		if (armstromNum == num2)
			isArmstrom = true;
		return isArmstrom;
	}

	public static ArrayList<Integer> ArmstromNum1(int[] arr) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (ArmstromNum(arr[index]))
				list1.add(arr[index]);
		}
		return list1;
	}

	public static void main(String[] args) {
		int [] arr = { 153, 279, 371, 303, 407};
		System.out.println(ArmstromNum1(arr));
	}
}
