package pallavi.coding_exam_16;

import java.util.HashMap;
import java.util.Set;

/*program 3 : return the number having max freq.
int[] arr = {6,2,6,6,6,6,3,4,15,3,3,5,5,12,13,17,12};*/
public class FreOfNumberDivisibleBy3 {

	int maxFreqOfNumberDivisibleBy3(int arr[]) {
		int maxDigit = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
		for (int currentDigit : arr) {
			if (currentDigit % 3 == 0) {
				if (hashMap.containsKey(currentDigit))
					hashMap.put(currentDigit, hashMap.get(currentDigit)+1);
				else
					hashMap.put(currentDigit, 1);
			}
		}
		Set<Integer> keys = hashMap.keySet();
		int max = 0;
		for (int currentKey : keys) {
			if (hashMap.get(currentKey) > max) {
				max = hashMap.get(currentKey);
				maxDigit = currentKey;
			}
		}
		return maxDigit;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
		int MaxDigitFreq=new FreOfNumberDivisibleBy3().maxFreqOfNumberDivisibleBy3(arr);
		System.out.println("Digit having maximum frequency :" +MaxDigitFreq );

	}

}
