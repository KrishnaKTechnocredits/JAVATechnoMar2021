package madhavi_Raut.CodingExam.Exam_16;

import java.util.ArrayList;
import java.util.Arrays;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
output : 6 freq is 5*/
public class FindNumHavingMaxFrequency {

	String getNumHavingMaxFrequency(int[] arr) {
		Integer[] newArr = new Integer[arr.length];
		for (int index = 0; index < arr.length; index++) {
			newArr[index] = Integer.valueOf(arr[index]);
		}

		ArrayList<Integer> arrList = new ArrayList<Integer>(Arrays.asList(newArr));
		int maxCount = 0, maxDigit = 0;

		for (int index = 0; index < arrList.size(); index++) {
			if (arrList.indexOf(arrList.get(index)) == 0) {
				int count = 0;
				while (arrList.contains(arr[index])) {
					count++;
					arrList.set(arrList.indexOf(arr[index]), 0);

				}
				if (maxCount < count) {
					maxCount = count;
					maxDigit = arr[index];
				}
			}
		}
		return maxDigit + " frequency is: " + maxCount;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println(new FindNumHavingMaxFrequency().getNumHavingMaxFrequency(arr));
	}
}
