package shashank.coding_exam12;

import java.util.ArrayList;

/*
Programming Test - 12 : 22nd May'2021

1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15
*/
public class DivisibleByThreeOrFive {

	ArrayList<Integer> getDivisibleByThreeOrFive(ArrayList<Integer> list) {
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for (int index = 0; index < list.size(); index++) {
			if ((list.get(index) % 3 == 0 || list.get(index) % 5 == 0)) {
				list1.add(list.get(index));
			}
		}
		return list1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DivisibleByThreeOrFive divisibleByThreeOrFive = new DivisibleByThreeOrFive();
		int arr[] = { 10, 2, 3, 6, 15, 44, 32 };
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : arr) {
			list.add(i);
		}
		ArrayList<Integer> output = divisibleByThreeOrFive.getDivisibleByThreeOrFive(list);
		System.out.println(output);
	}
}
