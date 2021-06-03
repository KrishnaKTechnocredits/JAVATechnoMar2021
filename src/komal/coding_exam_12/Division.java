package komal.coding_exam_12;

import java.util.ArrayList;

/*1) ArrayList<Integer> filerNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.
input : [10,2,3,6,15,44,32]
output : 10,3,6,15     
*/

public class Division {

	public ArrayList<Integer> filterNumber(ArrayList<Integer> numbers) {
		ArrayList<Integer> resultedArray = new ArrayList<Integer>();
		for (int index = 0; index < numbers.size(); index++) {
			int num = numbers.get(index);
			if (num % 3 == 0 || num % 5 == 0 || (num % 3 == 0 && num % 5 == 0))
				resultedArray.add(numbers.get(index));
		}
		return resultedArray;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(2);
		numbers.add(3);
		numbers.add(6);
		numbers.add(15);
		numbers.add(44);
		numbers.add(32);

		Division t1 = new Division();
		System.out.println(t1.filterNumber(numbers));
	}
}