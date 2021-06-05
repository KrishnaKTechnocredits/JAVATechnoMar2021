/*
Test - 16 :
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
---------------------------------------------------
 */
package radha.CodingTest16;

import java.util.HashMap;

public class FindNumFreq {
	
	static HashMap<Integer, Integer> getFreqOfEachNum(int[] input) {
		HashMap<Integer, Integer> numFreq = new HashMap<Integer, Integer>(); 
		for(int index=0;index<input.length;index++) {
			if(numFreq.containsKey(input[index])) {
				numFreq.put(input[index], numFreq.get(input[index])+1);
			}else
				numFreq.put(input[index], 1);	
		}
		return numFreq;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		HashMap<Integer, Integer> frequency = getFreqOfEachNum(arr);
		System.out.println("Frequency of each number in the array \n"+frequency);
	}
}
