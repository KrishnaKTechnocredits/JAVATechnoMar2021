package trupti.CodingExam13;

import java.util.ArrayList;

/*return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]
 */

public class ArmStrongNumber {

	boolean checkArmStrongNumber(int number) {
		String str = String.valueOf(number);
		int sum = 0;
		for(int index = 0; index < str.length(); index++) {
			int temp = Integer.parseInt(String.valueOf(str.charAt(index)));
			int cubeTemp = temp * temp * temp;
			sum += cubeTemp;
		}

		if(sum == number)
			return true;
		else
			return false;
	}

	public ArrayList<Integer> getArmStrongNumber(int numbser[]){
		ArrayList<Integer> output = new ArrayList<Integer>();

		for(int index = 0; index <numbser.length; index++) {
			if (checkArmStrongNumber(numbser[index]))
				output.add(numbser[index]);

		}
		return output;
	}

	public static void main(String[] args) {
		int [] input = {153,279,371,303,407};
		ArrayList<Integer> output = new ArmStrongNumber().getArmStrongNumber(input);
		System.out.println(output);
	}

}