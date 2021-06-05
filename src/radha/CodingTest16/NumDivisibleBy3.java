/*
program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
 */
package radha.CodingTest16;

import java.util.HashMap;

public class NumDivisibleBy3 {
	
	HashMap<Integer, Integer> getFreqOfNumDivisibleBy3(int[] input){
		HashMap<Integer, Integer> divFreq = new HashMap<Integer, Integer>();
		for(int indexNum :input) {
			if(indexNum%3==0) {
				if(divFreq.containsKey(indexNum))
					divFreq.put(indexNum, divFreq.get(indexNum)+1);
				else
					divFreq.put(indexNum, 1);
			}
		}
		return divFreq;
	}
	
	public static void main(String[] args) {
		NumDivisibleBy3 divisible = new NumDivisibleBy3();
		int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		HashMap<Integer, Integer> numDivBy3Freq= divisible.getFreqOfNumDivisibleBy3(arr);
		System.out.println("Frequency of the numbers which are divisible by 3 \n"+numDivBy3Freq);
	}

}
