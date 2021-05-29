package kapil.Collection;

import java.util.ArrayList;

public class ArrayListDivide3And5 {

	ArrayList<Integer> filerNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();

		for (int index = 0; index < arr.size(); index++) {
			int number = arr.get(index);
			if (number % 3 == 0 || number % 5 == 0)

				output.add(number);

		}
		return output;
	}

	public static void main(String[] args) {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(10);
		numberList.add(2);
		numberList.add(3);
		numberList.add(6);
		numberList.add(15);
		numberList.add(44);
		numberList.add(32);
		ArrayListDivide3And5 arraylistdivide3And5 = new ArrayListDivide3And5();
		ArrayList<Integer> output = arraylistdivide3And5.filerNumber(numberList);
		System.out.println(output);
	}

}
