//Test - 16 : 
//Program 1 : freq of each digit
//int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};

package neha_Rathi.codingExam17;

import java.util.*;

public class FrequencyOfeachDigit {
	
	static HashMap<Integer,Integer> calcFreq(int[] arr) {
		HashMap<Integer,Integer> hm= new HashMap<Integer,Integer>();
		for(int index=0;index<arr.length;index++) {
			if(hm.containsKey(arr[index])) 
				hm.put(arr[index], hm.get(arr[index])+1);
			else
				hm.put(arr[index], 1);
		}
		return hm;
	}

	public static void main(String[] args) {
		int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		System.out.println(calcFreq(arr));
	}
}
