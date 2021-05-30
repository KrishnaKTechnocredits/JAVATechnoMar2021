package madhavi_Raut.CodingExam.Exam_17;

import java.util.ArrayList;

/*Program 2 : triplet having maximum sum, index overlapping is allowed.
input : [1,10,2,3,1,11,4,2,1]
output : 11,4,2 -> 17*/
public class FindMaxTriplet {

	ArrayList<Integer> getMaxTriplet(int[] arr) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		int maxSum = 0, sum = 0;
		for (int index = 0; index < arr.length; index++) {
			if (index < arr.length - 2) {
				sum = arr[index] + arr[index + 1] + arr[index + 2];
				if (maxSum < sum) {
					maxSum = sum;
					if (!arrList.isEmpty()) {
						arrList.clear();
					}
					arrList.add(Integer.valueOf(arr[index]));
					arrList.add(Integer.valueOf(arr[index + 1]));
					arrList.add(Integer.valueOf(arr[index + 2]));
				}
			}
		}
		return arrList;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 10, 2, 3, 1, 11, 4, 2, 1 };
		System.out.println("ArrayList of triplet having maximum sum: " + new FindMaxTriplet().getMaxTriplet(arr));
	}
}
