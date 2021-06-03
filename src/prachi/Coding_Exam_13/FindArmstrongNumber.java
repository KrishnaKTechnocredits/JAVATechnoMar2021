package prachi.Coding_Exam_13;

/*"1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}*/

import java.util.ArrayList;

public class FindArmstrongNumber {
	static int[] numberArr = { 153, 279, 371, 303, 407 };

	public static ArrayList<Integer> findArmstrongNumber(int[] number) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int num : number) {
			int originalNum = num;
			int sum = 0;
			while (originalNum > 0) {
				int reminder = originalNum % 10;
				originalNum = originalNum / 10;
				sum = sum + (reminder * reminder * reminder);
			}
			if (sum == num)
				output.add(num);
		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> output = FindArmstrongNumber.findArmstrongNumber(numberArr);
		System.out.println("Armstrong numbers from input array are: "+output);
	}
}