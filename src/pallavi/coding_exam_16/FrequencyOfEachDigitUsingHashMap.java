package pallavi.coding_exam_16;

import java.util.HashMap;

/*Program 1 : freq of each digit
int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};*/

public class FrequencyOfEachDigitUsingHashMap {
	
	void frequencyofEachDigit(int arr[]) {
		HashMap<Integer,Integer> hashMap= new HashMap<Integer,Integer>();
		for(int currentDigit : arr) {
			if(hashMap.containsKey(currentDigit)) {
				hashMap.put(currentDigit,hashMap.get(currentDigit)+1);
			}else {
				hashMap.put(currentDigit, 1);
			}
		}
		
		System.out.println(hashMap);
	}
	public static void main(String[] args) {
		int[] arr = {1,2,1,1,3,4,5,3,3,4,5,5,2};
		new FrequencyOfEachDigitUsingHashMap().frequencyofEachDigit(arr);
		
	}

}
