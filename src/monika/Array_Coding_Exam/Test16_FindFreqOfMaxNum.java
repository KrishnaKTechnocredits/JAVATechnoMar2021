package monika.Array_Coding_Exam;

import java.util.HashMap;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
String getMaxFreqNumber(int[] arr){
}
output : 6 freq is 5*/
public class Test16_FindFreqOfMaxNum {

	static String getMaxFreqNum(int[] arr) {
		HashMap<Integer, Integer> tm = new HashMap<Integer, Integer>();
		int maxValueCount = 0;
		int maxKeyHold = 0;
		for (int keynum : arr) {
			if (tm.containsKey(keynum)) {
				tm.put(keynum, tm.get(keynum) + 1);
				if (maxValueCount <= tm.get(keynum)) {
					maxValueCount = tm.get(keynum);
					maxKeyHold = keynum;
				}

			} else
				tm.put(keynum, 1);
		}
		return "Number is : " + maxKeyHold + " freq is " + maxValueCount;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		String result = getMaxFreqNum(arr);
		System.out.println(result);

	}

}
