/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

package sangeeta.CodingExam;

import java.util.HashMap;

public class CodingExam16_P2 {
	
	HashMap<Integer, Integer> getFreqOfDigitsDivBy3(int [] arr){
		HashMap<Integer, Integer> DigitsDivBy3 = new HashMap<Integer, Integer>();
		for(int index = 0; index<arr.length; index++) {
			int num = arr[index];
			if(num % 3 == 0) {
				if(DigitsDivBy3.containsKey(num))
					DigitsDivBy3.put(num, DigitsDivBy3.get(num)+1);
				else
					DigitsDivBy3.put(num, 1);
			}
		}
		return DigitsDivBy3;
	}
	
	public static void main(String[] args) {
		CodingExam16_P2 codingExam16_P2 = new CodingExam16_P2();
		int [] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};
		HashMap<Integer, Integer> output = codingExam16_P2.getFreqOfDigitsDivBy3(arr);
		System.out.println("Digits divided by 3 are "+output);
	}
}
