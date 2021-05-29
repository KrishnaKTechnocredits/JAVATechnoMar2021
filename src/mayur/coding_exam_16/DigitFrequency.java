package mayur.coding_exam_16;
import java.util.HashMap;

public class DigitFrequency {
	HashMap<Integer, Integer> getDigitFrequency(int[] arr) {
		HashMap<Integer, Integer> DigitFrequency = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			int num = arr[index];
			if (DigitFrequency.containsKey(num))
				DigitFrequency.put(num, DigitFrequency.get(num) + 1);
			else
				DigitFrequency.put(num, 1);
		}
		return DigitFrequency;
	}

	public static void main(String[] args) {
		DigitFrequency digit = new DigitFrequency();
		int[] arr = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> output = digit.getDigitFrequency(arr);
		System.out.println("Frequency of each digit is " + output);
	}
}
