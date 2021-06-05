package trupti.CodingExam16;

import java.util.HashMap;

/*Program 1 : frequency of each digit divisible by 3
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class FrequencyDigitDivBy3 {

	void getDigitFreq(int[] digit) {
		HashMap<Integer,Integer>digitFreqMap=new HashMap<Integer,Integer>();
		for(int index=0;index<digit.length;index++) {
			int currentDigit=digit[index];
			if(currentDigit%3==0) {
				if(digitFreqMap.containsKey(currentDigit)) {
					int cnt=digitFreqMap.get(currentDigit)+1;
					digitFreqMap.put(currentDigit,cnt);
				} else {
					digitFreqMap.put(currentDigit,1);
				}
			}
		}
		System.out.println(digitFreqMap);
	}

	public static void main(String[] args) {
		FrequencyDigitDivBy3 frequencydigitdivby3=new FrequencyDigitDivBy3();
		int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};
		frequencydigitdivby3.getDigitFreq(arr);
	}

}
