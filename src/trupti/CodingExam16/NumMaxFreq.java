package trupti.CodingExam16;
/*
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

import java.util.HashMap;
import java.util.Set;

public class NumMaxFreq {
	String getMaxFreqNumber(int[] digit){
		HashMap<Integer,Integer>digitFreqMap=new  HashMap<Integer,Integer>();
		for(int index=0;index<digit.length;index++) {
			int currentDigit=digit[index];
			if(digitFreqMap.containsKey(currentDigit)) {
				int cnt=digitFreqMap.get(currentDigit)+1;
				digitFreqMap.put(currentDigit, cnt);
			}else {
				digitFreqMap.put(currentDigit, 1);
			}
		}
		int maxFreq=0;
		int maxFreqDigit=0;
		Set<Integer> keys=digitFreqMap.keySet();
		for(int currentKey : keys) {
			if(digitFreqMap.get(currentKey)> maxFreq) {
				maxFreq=digitFreqMap.get(currentKey);
				maxFreqDigit=currentKey;
			}
		}
		return maxFreqDigit+ " Frequency is "+maxFreq;
	}
	
	
;
	public static void main(String[] args) {
		NumMaxFreq numMaxFreq=new NumMaxFreq();
		int[] array = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		String output=numMaxFreq.getMaxFreqNumber(array);
		System.out.println(output);
		

	}

}
