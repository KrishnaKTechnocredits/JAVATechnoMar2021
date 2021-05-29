package sai.coding_exam13;

import java.util.ArrayList;

public class ArmstorngNumbers {

	public ArrayList<Integer> getArmstrongNumbers(int[] inputNumbers) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		int var1 = 0, var2 = 0, var3 = 0;
		for (int index = 0; index < inputNumbers.length; index++) {
			var1 = 0;
			var3 = 0;
			var2 = inputNumbers[index];
			while (var2 > 0) {
				var1 = var2 % 10;
				var2 = var2 / 10;
				var3 = var3 + (var1 * var1 * var1);
			}
			if (inputNumbers[index] == var3)
				number.add(var3);
		}

		return number;
	}

	public static void main(String[] args) {
		int[] arr = { 153, 279, 371, 303, 407 };
		ArmstorngNumbers armstorngNumbers = new ArmstorngNumbers();
		System.out.println("Armstorng numbers from the given array is: ");
		ArrayList<Integer> output = armstorngNumbers.getArmstrongNumbers(arr);
		System.out.println(output);

	}

}
