/*
1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}
*/

package sandesh.coding_exam_13;

import java.util.ArrayList;

public class ArmstrongNumbers {

	public ArrayList<Integer> getArmStrongNumber(int numbers[]){
		ArrayList<Integer> numArmstrongAL = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int cube = 0;
			int tempNum = 0;
			int mod = 0;
			tempNum = numbers[index];
			while (tempNum != 0) {
				mod = tempNum % 10;
				tempNum = tempNum / 10;
				cube += (mod * mod * mod );
			}
			if (cube == numbers[index]) {
				numArmstrongAL.add(numbers[index]);
			}
			
		}
		return numArmstrongAL;
	}
	
	public static void main(String[] args) {
		int[] numArray = {153,279,371,303,407};
		ArrayList<Integer> numArmStrong = new ArrayList<Integer>();
		numArmStrong = new ArmstrongNumbers().getArmStrongNumber(numArray);
		System.out.println("Armstrong numbers from given Array are -: ");
		System.out.println(numArmStrong.toString());
	}
}
