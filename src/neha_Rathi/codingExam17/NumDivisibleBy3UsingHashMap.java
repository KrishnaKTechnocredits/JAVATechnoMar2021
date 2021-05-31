//program 2 : find freq of only numbers div by 3
//int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};

package neha_Rathi.codingExam17;

import java.util.HashMap;

public class NumDivisibleBy3UsingHashMap {
	
	static HashMap<Integer,Integer> NumDivisibleBy3(int[] arr) {
		HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
		for(int index=0;index<arr.length;index++) {
			if(arr[index]%3==0) {
				if(hm.containsKey(arr[index])) 
					hm.put(arr[index], hm.get(arr[index]));
				else
					hm.put(arr[index], 1);
			}
		}
		return hm;
	}

	public static void main(String[] args) {
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		System.out.println(NumDivisibleBy3(arr));
	}
}
