/*
 1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}
 */

package ankit.coding_exam_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class ArmstrongNumberArrayList{

	static ArrayList<Integer> getArmstrongNumber(ArrayList<Integer> intArrList) {
		ArrayList<Integer> output = new ArrayList(); 
		for(int index = 0 ; index < intArrList.size(); index ++ ) {
			int targetNum = intArrList.get(index);
			boolean flag = isArmstrong(targetNum);
			if (flag) {
				output.add(intArrList.get(index));
			}
		}
		return output;
	}

	private static boolean isArmstrong(int targetNum) {
		int temp = targetNum;
		int sum = 0;
		while(temp > 0) {
			int rem = temp % 10 ;
			sum = sum + (rem*rem*rem);
			temp = temp/10;
		}
		if (targetNum == sum)
			return true;
		else {
			return false;
		}
	}

	public static void main(String[] args) {
		int[] intArr = {153,279,371,303,407};
		//Below line logic need to understand from Maulik tried it from Google.
		ArrayList<Integer> intArrList = IntStream.of(intArr).boxed().collect(Collectors.toCollection(ArrayList::new));
		System.out.println("Input Array List :"+intArrList);
		System.out.println("Output Array List of Armstrong Numbers"+getArmstrongNumber(intArrList));
	}
}
