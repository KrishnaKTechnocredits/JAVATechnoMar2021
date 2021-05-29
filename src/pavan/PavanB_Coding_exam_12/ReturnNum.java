/*
 1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
 */

package pavan.PavanB_Coding_exam_12;

import java.util.ArrayList;

public class ReturnNum {
	
	ArrayList<Integer> filterNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0)
				output.add(arr.get(index));

		}
		return output;

	}

	public static void main(String[] args) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(10);
		arr.add(2);
		arr.add(3);
		arr.add(6);
		arr.add(15);
		arr.add(44);
		arr.add(32);

		ReturnNum returnNum= new ReturnNum();
		ArrayList<Integer> answer =returnNum.filterNumber(arr);
		System.out.println(answer);
		
	}

}
