package shivani.Coding_exam_16;

import java.util.HashMap;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

public class FreqOfEachDigit {

	HashMap<Integer, Integer> getDigitsFreq(int[] arr) {
	
	
	HashMap<Integer,Integer> digitFreqMap = new HashMap<Integer,Integer>();
	
	for (int index = 0; index < arr.length; index++) {
		int num = arr[index];
		if (digitFreqMap.containsKey(num))
			digitFreqMap.put(num, digitFreqMap.get(num) + 1);
		else
			digitFreqMap.put(num, 1);
	}
	return digitFreqMap;
}

public static void main(String[] args) {
	FreqOfEachDigit FreqOfEachDigit = new FreqOfEachDigit();
	int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
	HashMap<Integer, Integer> output = FreqOfEachDigit.getDigitsFreq(arr);
	System.out.println("Frequency of each digit is " + output);
}
}
