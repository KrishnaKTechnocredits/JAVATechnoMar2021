package monali.coding_exam_12;

import java.util.ArrayList;

public class DivisibleNumber {

	ArrayList<Integer> divisibleNum(ArrayList<Integer> numberList) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < numberList.size(); index++) {
			if (numberList.get(index) % 3 == 0 || numberList.get(index) % 5 == 0)
				output.add(numberList.get(index));
		}

		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> number = new ArrayList<Integer>();
		number.add(10);
		number.add(2);
		number.add(3);
		number.add(6);
		number.add(15);
		number.add(44);
		number.add(32);

		DivisibleNumber num = new DivisibleNumber();
		ArrayList<Integer> Answer = num.divisibleNum(number);
		System.out.println(Answer);
	}

}
