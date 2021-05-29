/*
 Programming Test - 12 : 22nd May'2021
1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.
input : [10,2,3,6,15,44,32]
output : 10,3,6,15
 */
package ravindra_J.coding_exam_12_Coll_ArrayList;

import java.util.ArrayList;

public class PrintAllNoDiv {
	ArrayList<Integer> filerNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			int num = arr.get(index);
			if (num % 3 == 0 || num % 5 == 0) {
				output.add(num);
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
		input.add(5);
		System.out.println(input);
		PrintAllNoDiv printallnodiv = new PrintAllNoDiv();
		ArrayList<Integer> output = printallnodiv.filerNumber(input);
		System.out.println("Output Is: " + output);
	}
}
