/*
1. return all the arm-strong number from given array.
input: [153,279,371,303,407]
output: [153,371,407]

public ArrayList<Integer> getArmStrongNumber(int numbser[]){
	//write your logic
}
 */

package sourabh.CodingExam_13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindArmStrongNumber {
	public ArrayList<Integer> getArmStrongNumber(ArrayList<Integer> numberList) {
		ArrayList<Integer> OutputNumberList = new ArrayList<Integer>();
		for (int index = 0; index < numberList.size(); index++) {
			int temp = 0;
			int rem = 0;
			int ans = 0;			
			temp = numberList.get(index);
			while (temp >0) {
				rem = temp % 10;
				temp = temp / 10;
				ans = ans + (rem * rem * rem);
			}
			if (ans == numberList.get(index)) {
				OutputNumberList.add(numberList.get(index));
			}
		}
		return OutputNumberList;
	}

	public static void main(String[] args) {

		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(153);
		numberList.add(279);
		numberList.add(371);
		numberList.add(303);
		numberList.add(407);

		// System.out.println(numberList);

		FindArmStrongNumber findArmStrongNumber = new FindArmStrongNumber();
		ArrayList<Integer> output = findArmStrongNumber.getArmStrongNumber(numberList);
		System.out.println(output);
	}
}
