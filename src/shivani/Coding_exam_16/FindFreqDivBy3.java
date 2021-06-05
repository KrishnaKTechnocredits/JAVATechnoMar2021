package shivani.Coding_exam_16;

import java.util.HashMap;

/*program 2 : find freq of only numbers div by 3
int[] arr = {6,2,6,6,3,4,15,3,3,5,5,12,13,17,12};*/

public class FindFreqDivBy3 {
	HashMap<Integer, Integer> getDigitsFreq(int[] arr) {
		
		
		HashMap<Integer,Integer> digitFreqdivBy3 = new HashMap<Integer,Integer>();
		
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (num%3==0) {
				if (digitFreqdivBy3.containsKey(num)) 

					digitFreqdivBy3.put(num, digitFreqdivBy3.get(num) + 1);
			else
				digitFreqdivBy3.put(num, 1);
		}
		}
		return digitFreqdivBy3;
	}
		public static void main(String[] args) {
			FindFreqDivBy3 findFreqDivBy3 = new FindFreqDivBy3 ();
			int[] arr = { 6,2,6,6,3,4,15,3,3,5,5,12,13,17,12 };
			findFreqDivBy3.getDigitsFreq(arr);
			System.out.println(findFreqDivBy3.getDigitsFreq(arr));
		}

}
