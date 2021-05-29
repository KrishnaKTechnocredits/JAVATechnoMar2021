/*
 Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15


 */

package upasana.coding_exam_12;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDivBy3And5 {

	ArrayList<Integer> divNumber(ArrayList<Integer> arrList) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < arrList.size(); index++) {
			if (arrList.get(index) % 3 == 0) {
				output.add(arrList.get(index));
			} else if (arrList.get(index) % 5 == 0) {
				output.add(arrList.get(index));
			} else if (arrList.get(index) % 3 == 0 && arrList.get(index) % 5 == 0) {
				output.add(arrList.get(index));
			}

		}

		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> input = new ArrayList<Integer>(); 
		input.add(10);
		input.add(2);
		input.add(3);
		input.add(6);
		input.add(15);
		input.add(44);
		input.add(32);

		ArrayListDivBy3And5 arrList = new ArrayListDivBy3And5();
		ArrayList<Integer> output = arrList.divNumber(input);
		System.out.println(output);

	}
}
