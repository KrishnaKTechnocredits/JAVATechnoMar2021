/*
 * Test - 16 : 
Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
 */

package sourabh.CodingExam_16;

import java.util.HashMap;

public class FreqOfEachDigit {
	HashMap<Integer, Integer> getFreqOfEachDigit(int[] arrinput){
		HashMap<Integer, Integer> wordFrepMap= new HashMap<Integer, Integer>();
		for(int index=0; index<arrinput.length; index++) {
			if(wordFrepMap.containsKey(arrinput[index]))
				wordFrepMap.put(arrinput[index], wordFrepMap.get(arrinput[index])+1);
			else
				wordFrepMap.put(arrinput[index], 1);
		}
		return wordFrepMap;
		
	}
	public static void main(String[] args) {
		FreqOfEachDigit freqOfEachDigit= new FreqOfEachDigit();
		int[] arrInput={1,2,1,1,3,4,5,3,3,4,5,5,2}; 
		HashMap<Integer, Integer> output= freqOfEachDigit.getFreqOfEachDigit(arrInput);
		System.out.println(output);
	}
	
}
