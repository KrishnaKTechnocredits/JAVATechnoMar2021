/*ArrayList<Integer> filterNumber(ArrayList<Integer> arr) [15 mins]
all the numbers, which is div by 3 or by 5 or by 3 & 5.

input : [10,2,3,6,15,44,32]
output : 10,3,6,15*/

package sangeeta.CodingExam;

import java.util.ArrayList;

public class CodingExam12_P1 {

	ArrayList<Integer> filterNumber(ArrayList<Integer> arr) {
		ArrayList<Integer> outputArr = new ArrayList<Integer>();
		for (int index = 0; index < arr.size(); index++) {
			if (arr.get(index) % 3 == 0 || arr.get(index) % 5 == 0)
				outputArr.add(arr.get(index));
		}
		return outputArr;
	}

	public static void main(String[] args) {
		CodingExam12_P1 codingExam12_P1 = new CodingExam12_P1();
		ArrayList<Integer> numArr = new ArrayList<Integer>();
		numArr.add(10);
		numArr.add(2);
		numArr.add(3);
		numArr.add(6);
		numArr.add(15);
		numArr.add(44);
		numArr.add(32);
		ArrayList<Integer> outputArr = codingExam12_P1.filterNumber(numArr);
		System.out.println("Numbers divisible by 3 & 5 are " + outputArr);
	}

}
