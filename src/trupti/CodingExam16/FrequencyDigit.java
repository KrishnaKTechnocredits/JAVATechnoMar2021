package trupti.CodingExam16;

import java.util.HashMap;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

public class FrequencyDigit {
	static void getDigitFreq(int[] digit) {
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
	}

		/*for(int dig: digit) {
			if(digitFreqMap.containsKey(dig)) {
				int cnt=digitFreqMap.get(dig)+1;
				digitFreqMap.put(dig, cnt);
			}else {
				digitFreqMap.put(dig, 1);
			}
		}
		System.out.println(digitFreqMap);
	}*/
	public static void main(String[] args) {
		int [] arr={1,2,1,1,3,4,5,3,3,4,5,5,2};
		//getDigitFreq(arr);
		//FrequencyDigit frequencyDigit = new FrequencyDigit();
		new FrequencyDigit().getDigitFreq(arr);

	}

}
