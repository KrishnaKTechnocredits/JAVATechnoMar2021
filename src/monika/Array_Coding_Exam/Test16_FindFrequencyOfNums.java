package monika.Array_Coding_Exam;

import java.util.*;

/*Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
*/
public class Test16_FindFrequencyOfNums {
	// Modern way
	public static HashMap<Integer, Integer> singleNumFreq(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int num : arr) {
			if (hm.containsKey(num)) {
				hm.put(num, hm.get(num) + 1);
			} else
				hm.put(num, 1);
		}
		return hm;
	}

	// Conventional way
	public static HashMap<Integer, Integer> findfreq(int[] arr) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int count = 0;
		int temp = 0;
		for (int index = 0; index < arr.length; index++) {
			if (!hm.containsKey(arr[index])) {
				for (int innerindex = 0; innerindex < arr.length; innerindex++) {
					if (arr[index] == arr[innerindex])
						count++;
				}
			}
			if (count > temp) {
				temp = count;
				hm.put(arr[index], temp);
				temp = 0;
				count = 0;
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		Test16_FindFrequencyOfNums obj = new Test16_FindFrequencyOfNums();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> hm = findfreq(arr);
		System.out.println(hm);

		HashMap<Integer, Integer> hm2 = singleNumFreq(arr);
		System.out.println(hm2);
	}

}
