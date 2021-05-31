//program 3 : return the number having max freq.
//int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

package neha_Rathi.codingExam17;

import java.util.*;

public class MaxNumByHashMap {
	
	static String maxNum(int[] arr) {
		int freq=0;
		int maxFreqNum=0;
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int index=0;index<arr.length;index++) {
			if(hm.containsKey(arr[index])) {
				hm.put(arr[index], hm.get(arr[index])+1);
			}else
				hm.put(arr[index], 1);
			if(freq<hm.get(arr[index])) {
				freq=hm.get(arr[index]);
				maxFreqNum=arr[index];
			}
		}
		return maxFreqNum+" number have maximum frequency & count of number is  "+freq;
	}

	public static void main(String[] args) {
		int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println(maxNum(arr));
	}
}
