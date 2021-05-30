/*
program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};

String getMaxFreqNumber(int[] arr){

}

output : 6 freq is 5
 */
package radha.CodingTest16;

import java.util.HashMap;
import java.util.Set;

public class FindNumWithMaxFreq {
	
	String getMaxFreqNumber(int[] arr){
		int maxFreq=0, maxFreqNumber =0;
		HashMap<Integer, Integer> freqHolder = new HashMap<Integer, Integer>();
		for(int currNum:arr) {
			if(freqHolder.containsKey(currNum)) {
				freqHolder.put(currNum, freqHolder.get(currNum)+1);
			}else
				freqHolder.put(currNum, 1);
		}
		
		Set<Integer> keySet = freqHolder.keySet();
		for(int number :keySet) {
			if(freqHolder.get(number)>maxFreq) {
				maxFreq=freqHolder.get(number);
				maxFreqNumber = number;
			}	
		}
		return maxFreqNumber+" frequency is : "+maxFreq;
	}
	
	public static void main(String[] args) {
		FindNumWithMaxFreq max = new FindNumWithMaxFreq();
		int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		String output =max.getMaxFreqNumber(arr);
		System.out.println(output);
	}
}