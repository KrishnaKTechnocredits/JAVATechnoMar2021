package prachi.Coding_Exam_12;

import java.util.ArrayList;

/*ArrayList<Integer> filerNumber(ArrayList<Integer> arr) 
all the numbers, which is div by 3 or by 5 or by 3 & 5.
input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

public class FilterNumber {
	ArrayList<Integer> filterNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> output = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0)
				output.add(arr.get(index));
		}
		return output;
	}

	public static void main(String[] args) {
		FilterNumber filterNum = new FilterNumber();
		ArrayList<Integer> arrayOfNum = new ArrayList<Integer>();
		arrayOfNum.add(10);
		arrayOfNum.add(2);
		arrayOfNum.add(3);
		arrayOfNum.add(6);
		arrayOfNum.add(15);
		arrayOfNum.add(44);
		arrayOfNum.add(32);
		ArrayList<Integer> output = filterNum.filterNumber(arrayOfNum);
		System.out.println("All the numbers, which is div by 3 or by 5 or by 3 & 5 are:  \n"+ output);
	}
}
