package kangan.Coding.Exam16;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class NumWithMaxFreq {

	int getNumWithMaxFreq(int[] input) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		int Maxnum = 0;
		int max = 0;
		for (int index = 0; index < input.length; index++) {
			int temp = input[index];
			if (output.containsKey(temp)) {
				int cnt = output.get(temp) + 1;
				output.put(temp, cnt);
				if (cnt > max) {
					max = cnt;
					Maxnum = input[index];
				}
			} else {
				output.put(temp, 1);
			}
		}
		System.out.println(Maxnum + " is having max freq :" + max);
		return Maxnum;
	}

	int getNumWithMaxFreq1(int[] input) {
		HashMap<Integer, Integer> output = new HashMap<Integer, Integer>();
		int maxnum = 0;
		int maxfreq = 0;
		for (int num: input) {
			if (output.containsKey(num)) {
				int cnt = output.get(num) + 1;
				output.put(num, cnt);
			} else {
				output.put(num, 1);
			}
		}
		Set<Integer> keys = output.keySet();
		for (int currentKey : keys) {
			if(output.get(currentKey)>maxfreq) {
				maxfreq=output.get(currentKey);
			 maxnum =currentKey;
			System.out.println(currentKey + " : " + output.get(currentKey));
			}
		}
		return maxnum;
	}

	public static void main(String[] args) {
		NumWithMaxFreq numWithMaxFreq = new NumWithMaxFreq();
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		// int output = numWithMaxFreq.getNumWithMaxFreq(arr);
		int output = numWithMaxFreq.getNumWithMaxFreq1(arr);
		System.out.println(output);

	}
}
