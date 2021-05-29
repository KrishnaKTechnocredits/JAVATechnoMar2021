package mayur.coding_exam_16;
import java.util.HashMap;
import java.util.Set;

public class MaxNumberFrequency {
	int getMaxFrequencyNumber(Integer[] arr) {
	HashMap<Integer, Integer> getMaxNumber = new HashMap<Integer, Integer>();
	for (int index = 0; index < arr.length; index++) {
		int num = arr[index];
		if (getMaxNumber.containsKey(num)) {
			int count = getMaxNumber.get(num) + 1;
			getMaxNumber.put(num, count);
		} else {
			getMaxNumber.put(num, 1);
		}
	}
	int maxFrequency = 0;
	int maxFrequencyNumber = 0;
	Set<Integer> keys = getMaxNumber.keySet();

	for (int index : keys) {

		if (getMaxNumber.get(index) > maxFrequency) {
			maxFrequency = getMaxNumber.get(index);
			maxFrequencyNumber = index;
		}
	}
	return maxFrequencyNumber;
}

public static void main(String[] args) {
	Integer[] arr = { 6, 2, 6, 6, 6, 6, 3, 4, 15, 3, 3, 5, 5, 12, 13, 17, 12 };
	int output = new MaxNumberFrequency().getMaxFrequencyNumber(arr);
	System.out.println(output + " : having maximum frequency");
}

}
