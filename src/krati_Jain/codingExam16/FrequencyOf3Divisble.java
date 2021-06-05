/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

package krati_Jain.codingExam16;

import java.util.*;

public class FrequencyOf3Divisble {

	public static void main(String[] args) {
		FrequencyOf3Divisble frequencyOf3Divisble = new FrequencyOf3Divisble();
		int[] arr = { 6, 2, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		System.out.println("Frequency of numbers divisble by 3 in the input array is : \n"
				+ frequencyOf3Divisble.getFrequency(arr));
	}

	HashMap<Integer, Integer> getFrequency(int[] arr) {
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (arr[index] % 3 == 0) {
				if (hash.get(arr[index]) != null)
					hash.put(arr[index], hash.get(arr[index]) + 1);
				else
					hash.put(arr[index], 1);
			}

		}
		return hash;
	}
}
