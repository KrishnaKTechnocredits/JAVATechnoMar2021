package madhavi_Khasbage.Coding_Exam_16;

import java.util.ArrayList;
import java.util.Arrays;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/

public class FindFrequencyOfNum {

	String getFrequencyOfEachDigit(int[] arr) {
		boolean[] checked = new boolean[arr.length];
		Arrays.fill(checked, false);
		String strOutput = "";
		for (int index = 0; index < arr.length; index++) {
			if (checked[index] == true) {
				continue;
			}
			int cnt = 1;
			for (int index1 = index +1; index1 < arr.length; index1++) {
				if (arr[index] == arr[index1]) {
					checked[index1] = true;
					cnt++;
				}
			}
			strOutput += arr[index] + " : " + cnt + "\n";
		}
		return strOutput;
	}
	public static void main(String[] args) {
		FindFrequencyOfNum objFrq = new FindFrequencyOfNum();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		System.out.println(objFrq.getFrequencyOfEachDigit(arr));
	}

}
