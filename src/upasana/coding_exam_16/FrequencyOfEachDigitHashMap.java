package upasana.coding_exam_16;
import java.util.HashMap;

public class FrequencyOfEachDigitHashMap {

	HashMap<Integer, Integer> getFreqOfEachDigitInArr(int[] arr) {

		HashMap<Integer, Integer> list = new HashMap<Integer, Integer>();
		for (int index = 0; index < arr.length; index++) {
			if (list.containsKey(arr[index]))
				list.put(arr[index], list.get(arr[index]) + 1);
			else
				list.put(arr[index], 1);

		}
		return list;
	}

	public static void main(String[] args) {
		FrequencyOfEachDigitHashMap obj = new FrequencyOfEachDigitHashMap();

		int[] arr1 = { 1, 2, 1, 1, 3, 4, 5, 3, 3, 4, 5, 5, 2 };
		HashMap<Integer, Integer> list1 = obj.getFreqOfEachDigitInArr(arr1);
		System.out.println(list1 + "\n");
	}
}