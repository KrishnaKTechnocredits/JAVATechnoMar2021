/*
  Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
 */
 
package priyanka_Panat.coding_exam_12;

import java.util.ArrayList;

public class NumberDivisibleArrayList {

	ArrayList<Integer> checkNumberDivisible(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0
					|| (arr.get(index) % 3 == 0 && arr.get(index) % 5 == 0)) {
				output.add(arr.get(index));
			}
		}
		return output;
	}

	public static void main(String[] args) {
		NumberDivisibleArrayList numberDivisibleArrayList = new NumberDivisibleArrayList();
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(2);
		numberList.add(3);
		numberList.add(6);
		numberList.add(15);
		numberList.add(44);
		numberList.add(32);
		ArrayList<Integer> res = numberDivisibleArrayList.checkNumberDivisible(numberList);
		System.out.println("Numbers divisible by 3 or 5 or by 3 and 5 are : " + res);
	}

}