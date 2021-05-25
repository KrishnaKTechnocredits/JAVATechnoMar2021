package aashay.Test_13;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/*
 * 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}
 */
public class ArmStrongNumber {

	public ArrayList<Integer> getArmStringNumber(int[] numbers) {
		
		ArrayList<Integer> numberArrayList = new ArrayList<Integer>();
		for (int index = 0; index < numbers.length; index++) {
			int armStrongNumber = 0;
			int cubeNumber = 0;
			int tempNumber = 0;
			tempNumber = numbers[index];
			while (tempNumber > 0) {
				cubeNumber = tempNumber % 10;
				tempNumber = tempNumber / 10;
				armStrongNumber += (cubeNumber * cubeNumber * cubeNumber);
			}
			if (armStrongNumber == numbers[index]) {
				numberArrayList.add(numbers[index]);
			}
		}
		return numberArrayList;
	}

	public static void main(String[] args) {
		ArmStrongNumber armStrongNumber = new ArmStrongNumber();
		int[] numbers = new int[] { 153, 279, 371, 303, 407 };
		ArrayList<Integer> output = armStrongNumber.getArmStringNumber(numbers);
		System.out.println("Armstrong number list: "+output.toString());

	}

}
