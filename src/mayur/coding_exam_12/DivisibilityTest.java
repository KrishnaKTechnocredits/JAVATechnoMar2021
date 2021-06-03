package mayur.coding_exam_12;

import java.util.ArrayList;

public class DivisibilityTest {
	ArrayList<Integer> getDivisibilityTest(ArrayList<Integer> arr) {
		ArrayList<Integer> arr1 = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0) {
				arr1.add(arr.get(index));
			}
		}
		return arr1;
	}

	public static void main(String[] args) {
		DivisibilityTest div = new DivisibilityTest();
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10);
		num.add(2);
		num.add(3);
		num.add(6);
		num.add(15);
		num.add(44);
		num.add(32);
		ArrayList<Integer> arr1 = div.getDivisibilityTest(num);
		System.out.println("The numbers divisible 3 or 5 are" + arr1);

	}
}
